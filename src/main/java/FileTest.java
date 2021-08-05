import java.io.File;
import java.io.IOException;

/**
 * @author hui
 * 2021/8/4 0004 11:41
 */
public class FileTest {
    public static void main(String[] args) {
        String dir = "D:\\workspace\\localTest\\src\\main\\java\\test\\";
        File file = new File(dir);
        if(file.isDirectory()){
            System.out.println("is dir");
        }
        if(file.isFile()){
            System.out.println("is file");
        }
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
