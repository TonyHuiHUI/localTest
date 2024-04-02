package bytecode.handler;



import bytecode.type.ClassFile;
import bytecode.type.U4;

import java.nio.ByteBuffer;

public class MagicHandler  implements BaseByteCodeHandler {
    //排序排在第一个
    @Override
    public int order() {
        return 0;
    }

    @Override
    public void read(ByteBuffer codeBuf, ClassFile classFile) throws Exception{
        //连续读取四个字节并转为U4对象
        classFile.setMagic(new U4(codeBuf.get(),codeBuf.get(),codeBuf.get(), codeBuf.get()));
        if (!"0xCAFEBABE".equalsIgnoreCase(classFile.getMagic().toHexString())){
            throw new Exception("这不是一个Class文件");
        }
    }
}
