/**
 * 方法的静态分派演示，静态分派与方法的重载有密切关联
 * 静态分派：所有依赖静态类型来定位方法执行版本的分派动作
 * @author hui
 * 2021/1/5 0005 16:01
 */
public class StaticDispatch {
    static abstract class Human{}
    static class Man extends Human{}
    static class Woman extends Human{}
    public void sayHello(Human guy){
        System.out.println("hello,guy!");
    }
    public void sayHello(Man guy){
        System.out.println("hello,gentleman!");
    }
    public void sayHello(Woman guy){
        System.out.println("hello,lady!");
    }

    // 编译器在重载时是通过参数的静态类型化而不是实际类型作为判断依据的。
    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        StaticDispatch sr = new StaticDispatch();
        sr.sayHello(man);//hello,guy!
        sr.sayHello(woman);//hello,guy!
        Man mem = new Man();
        sr.sayHello(mem);//hello,gentleman!
    }
}
