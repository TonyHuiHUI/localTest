package bytecode.handler;

import bytecode.type.ClassFile;
import bytecode.type.U2;

import java.nio.ByteBuffer;

public class InterfacesHandler implements BaseByteCodeHandler {
    @Override
    public int order() {
        return 5;
    }

    @Override
    public void read(ByteBuffer codeBuf, ClassFile classFile) throws Exception {
        //接口总数interfaces_count
        classFile.setInterfaces_count(new U2(codeBuf.get(),codeBuf.get()));
        int interfaces_count = classFile.getInterfaces_count().toInt();
        //解析接口表
        U2[] interfaces = new U2[interfaces_count];
        classFile.setInterfaces(interfaces);
        for (int i  = 0; i  < interfaces_count; i++){
            interfaces[i] = new U2(codeBuf.get(), codeBuf.get());
        }
    }
}
