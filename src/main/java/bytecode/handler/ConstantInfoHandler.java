package bytecode.handler;

import java.nio.ByteBuffer;

public interface ConstantInfoHandler {
    /**
     * 读取
     * @param codeBuf
     * @throws Exception
     */
    void read(ByteBuffer codeBuf) throws Exception;
}
