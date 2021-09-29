import org.apache.commons.lang3.concurrent.BasicThreadFactory;
import sun.util.locale.provider.FallbackLocaleProviderAdapter;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author hui
 * 2021/9/26 0026 14:18
 */
public class DrawHeart extends JPanel {
    private List<Float> values;
    private static final int MAX_VALUE = 200;
    private static final int MAX_COUNT_OF_VALUES = 45;
    private static final double pi = 3.1415926;
    private static Map<Float, List<Float>> xyLocal;
    private static ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(1,
            new BasicThreadFactory.Builder()
                    .daemon(true)
                    .namingPattern("draw-%d")
                    .build());

    public DrawHeart() {
        values = Collections.synchronizedList(new ArrayList<Float>());
        executor.execute(() -> {
//            Random rand = new Random();
            try {
//                while (true) {
//                    addValue(rand.nextInt(MAX_VALUE));
//                    repaint();
//                    Thread.sleep(100);
//                }
                while (true) {
                    for (float x : xyLocal.keySet()) {
                        addValue(x);
                        repaint();
                        Thread.sleep(100);
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int w = getWidth();
        int h = getHeight();
        int xDelta = 10;
        int length = values.size();
        System.out.println(length);
        for (int i = 0; i < length - 1; ++i) {
            int x1 = normalizeValueForXAxis(values.get(i), w);
            List<Integer> y1s = normalizeValueForYAxis(caculateValueForYAxis(values.get(i)), h);
            int x2 = normalizeValueForXAxis(values.get(i + 1), w);
            List<Integer> y2s= normalizeValueForYAxis(caculateValueForYAxis(values.get(i + 1)), h);

//            g2d.setColor(Color.red);
//            for(int y1 = 0; y1 < y1s.size() - 1; y1++){
//                g2d.drawLine(xDelta * i + x1, y1s.get(y1) , xDelta * i + x1, y1s.get(y1 + 1));
//            }
//            g2d.drawLine(xDelta * i + x1, y1s.get(y1s.size() - 1) , xDelta * i + x2, y2s.get(0));
//            for(int y2 = 0; y2 < y2s.size() - 1; y2++){
//                g2d.drawLine(xDelta * i + x2, y2s.get(y2) , xDelta * i + x2, y2s.get(y2 + 1));
//            }
            for(int y1 = 0; y1 < y1s.size() - 1; y1++){
                g2d.drawString("*", xDelta  + x1, y1s.get(y1));
            }
        }
    }

    private void addValue(float value) {
        if (values.size() >= MAX_COUNT_OF_VALUES) {
            values.remove(0);
        }
        values.add(value);
    }

    private List<Float> caculateValueForYAxis(float value) {
        List<Float> result = xyLocal.get(value);
        return result;
    }

    private int normalizeValueForXAxis(double value, int width) {
        return (int) (width / 3 * (value + 1.5));
    }

    private List<Integer> normalizeValueForYAxis(List<Float> value, int height) {
        List<Integer> ret = new ArrayList<>();
        for(Float x : value){
            ret.add((int) ((double) height / 3 * ( 1.5 - x)));
        }
        return ret ;
    }

    public static void initJFrame() {
        JFrame jFrame = new JFrame("动态画图");
        jFrame.getContentPane().add(new DrawHeart());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(600, 600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }

    public static void initLocalXY() {
        xyLocal = new TreeMap<>();
        for (float y = (float) -1.5; y < 1.5; y += 0.1) {
            for (float x = (float) -1.5; x < 1.5; x += 0.05) {
                float a = x * x + y * y - 1;
                if ((a * a * a - x * x * y * y * y) <= 0.0) {
                    List<Float> tmp = xyLocal.getOrDefault(x, new LinkedList<>());
                    tmp.add(y);
                    xyLocal.put(x, xyLocal.getOrDefault(x, tmp));
                }
            }
        }
//        for (Map.Entry<Float, List<Float>> point: xyLocal.entrySet()){
//            point.getValue().sort(Comparator.naturalOrder());
//        }
    }

    public static void main(String[] args) {
        initLocalXY();
        initJFrame();
    }
}
