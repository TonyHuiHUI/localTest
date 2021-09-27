import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import javax.swing.*;
import java.awt.*;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author hui
 * 2021/9/26 0026 14:18
 */
public class DrawHeart extends JPanel {
    private List<Integer> values;
    private static final int MAX_VALUE = 200;
    private static final int MAX_COUNT_OF_VALUES = 50;
    private static final double pi = 3.1415926;
    private static ThreadPoolExecutor executor = (ThreadPoolExecutor)Executors.newFixedThreadPool(1,
            new BasicThreadFactory.Builder()
                    .daemon(true)
                    .namingPattern("draw-%d")
                    .build());
    public DrawHeart(){
        values = Collections.synchronizedList(new ArrayList<Integer>());
        executor.execute(() -> {
//            Random rand = new Random();
            try {
//                while (true) {
//                    addValue(rand.nextInt(MAX_VALUE));
//                    repaint();
//                    Thread.sleep(100);
//                }
                for (int i = -2; i <= 2; i += 0.01){
                    System.out.println("i : " + i);

                    addValue(i);
                    repaint();
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        int xDelta = w / values.size();
        int length = values.size();
        System.out.println("++++++++++++++++++");
        for (int i = 0; i < length - 1; ++i) {
            int x1 = normalizeValueForXAxis(values.get(i), w);
            int y1 = caculateValueForYAxis(values.get(i));
            int x2 = normalizeValueForXAxis(values.get(i+1), w);
            int y2 = caculateValueForYAxis(values.get(i+1));
            System.out.println(length);
            System.out.println("x1: " + x1 + " y1: " + y1 + " x2: " + x2 + " y2: " + y2);
            g2d.drawLine(xDelta * i + x1, y1, xDelta * (i + 1) + x2, y2);
        }
    }

    private void addValue(int value) {
//        if (values.size() >= MAX_COUNT_OF_VALUES) {
//            values.remove(0);
//        }
        values.add(value);
    }

    private int caculateValueForYAxis(int value){
        return (int)(Math.pow(Math.abs(value), 2/3) + (0.9 * Math.sqrt(pi - value * value)) * Math.sin(20 * pi * value));
    }
    private int normalizeValueForXAxis(int value, int width){
        return width / 4 * (value + 2);
    }

    private int normalizeValueForYAxis(int value, int height) {
        return (int) ((double) height / MAX_VALUE * value);
    }
    public static void initJFrame(){
        JFrame jFrame = new JFrame("动态画图");
        jFrame.getContentPane().add(new DrawHeart());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    public static void main(String[] args) {
        initJFrame();
    }
}
