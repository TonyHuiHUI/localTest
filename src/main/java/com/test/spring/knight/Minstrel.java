package com.test.spring.knight;

import java.io.PrintStream;

/**
 * @author hui
 * 2019/8/23 0023 11:52
 */
public class Minstrel {
    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest(){
        stream.println("Fa la la ,the knight is so brave");
    }

    public void singAfterQuest(){
        stream.println("Tee hee hee, the brave knight did embark on a quest");
    }
}
