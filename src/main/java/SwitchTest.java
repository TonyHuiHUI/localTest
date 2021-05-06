
/**
 * @author hui
 * 2019/6/13 0013 18:05
 */
public class SwitchTest {
    public static void main(String[] args) {
        int i = 30;
        switch (i) {
            case 20:
                System.out.println("2");
                break;
            case 30:
                System.out.println("2");
                break;
            case 50:
                System.out.println("2");
                break;
        }

        switch (i) {
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("2");
                break;
            case 5:
                System.out.println("2");
            case 7:
                System.out.println("2");
            case 9:
                System.out.println("2");
                break;
        }



        /*
        if (i == 2) {
            System.out.println("2");
        } else if (i == 3) {
            System.out.println("3");
        } else if (i == 4) {
            System.out.println("4");
        } else if (i == 5) {
            System.out.println("5");
        } else if (i == 6) {
            System.out.println("6");
        }*/
    }
}
