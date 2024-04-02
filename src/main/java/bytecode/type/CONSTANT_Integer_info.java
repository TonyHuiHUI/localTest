package bytecode.type;

import java.nio.ByteBuffer;

public class CONSTANT_Integer_info extends CpInfo{

    private U4 bytes;

    public CONSTANT_Integer_info(U1 tag) {
        super(tag);
    }

    @Override
    public void read(ByteBuffer codeBuf) throws Exception {
        bytes = new U4(codeBuf.get(), codeBuf.get(), codeBuf.get(),codeBuf.get());
    }

    public U4 getBytes() {
        return bytes;
    }

    public void setBytes(U4 bytes) {
        this.bytes = bytes;
    }
}
