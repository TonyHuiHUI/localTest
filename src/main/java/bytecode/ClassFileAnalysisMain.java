package bytecode;



import bytecode.type.ClassFile;
import bytecode.util.ClassFileAnalysiser;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class ClassFileAnalysisMain {
    public static ByteBuffer readFile(String classFilePath) throws Exception {
        File file = new File(classFilePath);
        if (!file.exists()){
            throw new Exception("file not exists!");
        }
        byte[] byteCodeBuf = new byte[4096];
        int length;
        try(InputStream in = new FileInputStream(file)){
            length = in.read(byteCodeBuf);
        }
        if (length  < 1){
            throw  new Exception("not read byte code");
        }
        //将字节数组包装为ByteBuffer
        return ByteBuffer.wrap(byteCodeBuf, 0, length).asReadOnlyBuffer();
    }

    public static void main(String[] args) throws Exception {
        //读取class文件
        ByteBuffer codeBuf = readFile("");
        //解析class文件
        ClassFile classFile = ClassFileAnalysiser.analysis(codeBuf);
        //打印魔数解析器解析出来的magic
        System.out.println(classFile.getMagic().toHexString());
    }
}
