package bytecode.handler;



import bytecode.type.ClassFile;
import bytecode.type.U2;

import java.nio.ByteBuffer;

public class VersionHandler implements BaseByteCodeHandler{
    //版本号解析器排在魔数解析器后面
    @Override
    public int order() {
        return 1;
    }

    @Override
    public void read(ByteBuffer codeBuf, ClassFile classFile) {
        //读取副版本号
        U2 minorVersion = new U2(codeBuf.get(), codeBuf.get());
        classFile.setMinor_version(minorVersion);
        //读取主版本号
        U2 majorVersion = new U2(codeBuf.get(), codeBuf.get());
        classFile.setMajor_version(majorVersion);
    }
}
