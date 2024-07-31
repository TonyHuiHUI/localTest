package jvm;

public class TestSynchronized {
    public synchronized void levelOne(){
        System.out.println("level one");
        levelTwo();
    }
    public synchronized void levelTwo(){
        System.out.println("level two");
    }
}
