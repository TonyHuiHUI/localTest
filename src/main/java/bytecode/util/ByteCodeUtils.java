package bytecode.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteCodeUtils {
    public static void savaToFile(String className, byte[] byteCode) throws IOException {
        File file = new File("D:\\workspace\\localTest\\src\\main\\java\\bytecode\\useASM\\" + className + ".class");
        if ((!file.exists() || file.delete()) && file.createNewFile()) {
            try (FileOutputStream fos = new FileOutputStream(file)) {
                fos.write(byteCode);
            }
        }
    }
}
