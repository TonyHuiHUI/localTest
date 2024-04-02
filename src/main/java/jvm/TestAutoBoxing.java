package jvm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestAutoBoxing {
    public static void main(String[] args) {
        /**
         * 编译后：
         *         List list1 = Arrays.asList(new Integer[]{
         *                 Integer.valueOf(1),
         *                 Integer.valueOf(2),
         *                 Integer.valueOf(3),
         *                 Integer.valueOf(4)});
         */
        List<Integer> list =  Arrays.asList(1,2,3,4);


        int sum = 0;
        /**
         * 编译后：
         *         for (Iterator localIterator = list.iterator(); localIterator.hasNext();){
         *             int i = ((Integer)localIterator.next()).intValue();
         *             sum += i;
         *         }
         *   遍历循环则把代码还原成了迭代器的实现，这也是为何遍历循环需要被遍历的类实现lterable接口的原因。
         */
        for (int i : list){
            sum += 1;
        }
        System.out.println(sum);
    }
}
