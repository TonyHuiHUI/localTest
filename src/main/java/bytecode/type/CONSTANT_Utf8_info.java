package bytecode.type;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class CONSTANT_Utf8_info extends CpInfo {

    private U2 length;
    private byte[] bytes;
    public CONSTANT_Utf8_info(U1 tag) {
        super(tag);
    }

    @Override
    public void read(ByteBuffer codeBuf) throws Exception {
        //读取长度
        length = new U2(codeBuf.get(), codeBuf.get());
        bytes = new byte[length.toInt()];
        //读取指定长度的字节到bytes数组
        codeBuf.get(bytes, 0, length.toInt());
    }

    @Override
    public String toString() {
        return super.toString() +
                "length=" + length.toInt() +
                ", str=" + new String(bytes, StandardCharsets.UTF_8);
    }

    public U2 getLength() {
        return length;
    }

    public void setLength(U2 length) {
        this.length = length;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
