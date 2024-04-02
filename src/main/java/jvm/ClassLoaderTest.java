package jvm;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


/**
 * 类加载器与instanceof关键字演示
 */
public class ClassLoaderTest {

    public static void main(String[] args) throws Exception {
        ClassLoader myLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                try{
                   String fileName = name.substring(name.lastIndexOf(".")+ 1 ) + ".class";
                    InputStream is = getClass().getResourceAsStream(fileName);
                    if (is == null){
                        return super.loadClass(name);
                    }
                    byte[] b = new byte[is.available()];
                    is.read(b);
                    return  defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                   throw new ClassNotFoundException(name);
                }
            }
        };

        Object obj = myLoader.loadClass("jvm.ClassLoaderTest").newInstance();
        System.out.println(obj.getClass());
        System.out.println(obj instanceof jvm.ClassLoaderTest);
    }

    /**
     * vm.TestClassLoader
     *
     * @throws ClassNotFoundException
     */
    @Test
    public void loadClass1() throws ClassNotFoundException {
        System.out.println(ClassLoaderTest.class.getClassLoader().loadClass("jvm.TestClassLoader").getName());
    }

    /**
     * my name is TestLClassLoader
     * jvm.TestClassLoader
     *
     * Class.forName 方式加载类会初始化所加载的类
     * @throws ClassNotFoundException
     */
    @Test
    public void loadClass2() throws ClassNotFoundException {
        System.out.println(Class.forName("jvm.TestClassLoader").getName());
    }
}
