import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import javax.swing.*;
import java.awt.*;
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
        for (int i = 0; i < length - 1; ++i) {
            int x1 = normalizeValueForXAxis(values.get(i), w);
            int x2 = normalizeValueForXAxis(values.get(i+1), w);
            System.out.println("x1: "+xDelta * i+ " y1: " + normalizeValueForYAxis(values.get(i), h));
            System.out.println("x2: "+xDelta * (i + 1) + " y2: " + normalizeValueForYAxis(values.get(i + 1), h));
            g2d.drawLine(xDelta * i, normalizeValueForYAxis(values.get(i), h),
                    xDelta * (i + 1), normalizeValueForYAxis(values.get(i + 1), h));
        }
    }

    private void addValue(int value) {
//        if (values.size() >= MAX_COUNT_OF_VALUES) {
//            values.remove(0);
//        }
        values.add(value);
    }

    private int caculateValueForYAxis(int value){
        return value;
    }
    private int normalizeValueForXAxis(int value, int width){
        return value;
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
