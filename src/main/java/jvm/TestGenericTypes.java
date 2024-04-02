package jvm;

import java.util.ArrayList;
import java.util.List;

public class TestGenericTypes {
    /**
     * 以下两个方法不能被编译
     * 因为类型擦除的原因，两个方法的参数最终变成了一样的List<E>，所以重载失败
     */
//    public static void method(List<String> list){
//        System.out.println("invoke method(List<String> list)");
//    }
//
//    public static void method(List<Integer> list){
//        System.out.println("invoke method(List<Integer> list))");
//    }


    /**
     * ?????
     */

//        public static String method(List<String> list){
//            System.out.println("invoke method(List<String> list)");
//            return "";
//        }
//
//        public static int method(List<Integer> list){
//            System.out.println("invoke method(List<Integer> list))");
//            return 1;
//        }
//        public static void main (String [ ] args) {
//            method(new ArrayList<String>());
//            method(new ArrayList<Integer>());
//        }

}
