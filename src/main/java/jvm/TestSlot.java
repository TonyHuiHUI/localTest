package jvm;


/**
 * -verbose:gc
 */

public class TestSlot {
    public static void main(String[] args) {

        /**
         * [GC (System.gc())  71434K->66776K(375296K), 0.0342116 secs]
         * [Full GC (System.gc())  66776K->66673K(375296K), 0.0054296 secs]
         *
         * 执行System.gc();时,变量slotHolder1是处于作用于中，未被回收
         */
        byte[] slotHolder1 = new byte[64 * 1024 * 1024];
        System.gc();


        /**
         * [GC (System.gc())  71434K->66816K(375296K), 0.0268640 secs]
         * [Full GC (System.gc())  66816K->66673K(375296K), 0.0050346 secs]
         *
         * 执行System.gc();时,虽然离开了slotHolder2的作用域，但在此之后，没有任何对局部变量表的读写操作，
         * slotHolder原本所占用的Slot还没有被其他变量所复用，所以作为GC Roots一部分的局部变量表仍然保持着对它的关联。
         * 所以没有被回收
         */
        {
            byte[] slotHolder2 = new byte[64 * 1024 * 1024];
        }
        System.gc();


        /**
         * [GC (System.gc())  71434K->1249K(375296K), 0.0010008 secs]
         * [Full GC (System.gc())  1249K->1137K(375296K), 0.0045232 secs]
         *
         * 内存被正确回收
         */
        {
            byte[] slotHolder3 = new byte[64 * 1024 * 1024];
        }
        int a = 0;
        System.gc();
    }
}
