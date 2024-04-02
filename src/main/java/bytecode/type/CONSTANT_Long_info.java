package bytecode.type;

import java.nio.ByteBuffer;

public class CONSTANT_Long_info extends CpInfo {

    private U4 hight_bytes;
    private U4 low_bytes;

    public CONSTANT_Long_info(U1 tag) {
        super(tag);
    }

    @Override
    public void read(ByteBuffer codeBuf) throws Exception {
        //读取高32位
        hight_bytes = new U4(codeBuf.get(), codeBuf.get(), codeBuf.get(), codeBuf.get());
        //读取低32位
        low_bytes = new U4(codeBuf.get(), codeBuf.get(), codeBuf.get(), codeBuf.get());
    }

    public U4 getHight_bytes() {
        return hight_bytes;
    }

    public void setHight_bytes(U4 hight_bytes) {
        this.hight_bytes = hight_bytes;
    }

    public U4 getLow_bytes() {
        return low_bytes;
    }

    public void setLow_bytes(U4 low_bytes) {
        this.low_bytes = low_bytes;
    }
}
