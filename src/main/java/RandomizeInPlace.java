import java.util.Random;

/**
 * @author hui
 * 2019/5/13 0013 10:31
 * <p>
 * 原地排列给定的数列，产生随机排列
 */
public class RandomizeInPlace {

    public static void main(String[] args) {
        int[] target = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Random random = new Random();
        int n = target.length;
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < n; i++) {
                int tmp = target[i];
                int randomIndex = random.nextInt(n) % (n - i) + i;
                target[i] = target[randomIndex];
                target[randomIndex] = tmp;
            }
            for (int x : target) {
                System.out.print(x + " ");
            }
            System.out.println("\n");
        }
    }
}
