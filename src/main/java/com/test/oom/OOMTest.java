package com.test.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hui
 * 2019/9/19 0019 13:47
 */
public class OOMTest {
    public static void newArray() {
        List<ArrayTest> list = new ArrayList<>(16);
        while (true) {
            list.add(new ArrayTest());
        }
    }
    public static void main(String[] args) {
        ArrayTest arrayTest = new ArrayTest();
        newArray();
    }
}
