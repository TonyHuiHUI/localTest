package jvm;

public class TestAllocation {
    private static  final int _1MB = 1024 * 1024;

    public static void main(String[] args) {
        //testAllocationEden();
        //testAllocationBigObject();
        testTenuringThreshold();
    }

    /**
     *  -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     *
     *
     *
     *  [GC (Allocation Failure) [PSYoungGen: 7489K->1001K(9216K)] 7489K->5309K(19456K), 0.0022675 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
     * Heap
     *  PSYoungGen      total 9216K, used 7386K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
     *   eden space 8192K, 77% used [0x00000000ff600000,0x00000000ffc3c298,0x00000000ffe00000)
     *   from space 1024K, 97% used [0x00000000ffe00000,0x00000000ffefa600,0x00000000fff00000)
     *   to   space 1024K, 0% used [0x00000000fff00000,0x00000000fff00000,0x0000000100000000)
     *  ParOldGen       total 10240K, used 4307K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
     *   object space 10240K, 42% used [0x00000000fec00000,0x00000000ff034ec0,0x00000000ff600000)
     *  Metaspace       used 3468K, capacity 4496K, committed 4864K, reserved 1056768K
     *   class space    used 376K, capacity 388K, committed 512K, reserved 1048576K
     *
     */

    public static void testAllocationEden(){
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[ 2 * _1MB];
        allocation2 = new byte[ 2 * _1MB];
        allocation3 = new byte[ 2 * _1MB];
        allocation4 = new byte[ 4 * _1MB];
    }

    /**
     *  -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:PretenureSizeThreshold=3145728 -XX:+UseSerialGC
     *  Heap
     *  def new generation   total 9216K, used 3557K [0x00000000fec00000, 0x00000000ff600000, 0x00000000ff600000)
     *   eden space 8192K,  43% used [0x00000000fec00000, 0x00000000fef796a8, 0x00000000ff400000)
     *   from space 1024K,   0% used [0x00000000ff400000, 0x00000000ff400000, 0x00000000ff500000)
     *   to   space 1024K,   0% used [0x00000000ff500000, 0x00000000ff500000, 0x00000000ff600000)
     *  tenured generation   total 10240K, used 4096K [0x00000000ff600000, 0x0000000100000000, 0x0000000100000000)
     *    the space 10240K,  40% used [0x00000000ff600000, 0x00000000ffa00010, 0x00000000ffa00200, 0x0000000100000000)
     *  Metaspace       used 3467K, capacity 4496K, committed 4864K, reserved 1056768K
     *   class space    used 376K, capacity 388K, committed 512K, reserved 1048576K
     *
     *   PretenureSizeThreshold 只对serial和parNew回收器生效
     */
    public static void testAllocationBigObject(){
        byte[] allocation;
        allocation = new byte[ 4 * _1MB];
    }

    @SuppressWarnings("unused")
    public static void testTenuringThreshold(){
        byte[] allocation1, allocation2, allocation3;
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[4 * _1MB];
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }
}
