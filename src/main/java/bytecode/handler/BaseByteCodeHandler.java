package bytecode.handler;



import bytecode.type.ClassFile;

import java.nio.ByteBuffer;

public interface BaseByteCodeHandler {

    /**
     * 解释器的排序值
     * @return
     */
    int order();

    /**
     * 读取
     */
    void read(ByteBuffer codeBuf, ClassFile classFile) throws Exception;
}
