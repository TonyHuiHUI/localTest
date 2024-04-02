package bytecode.util;

import java.util.HashMap;
import java.util.Map;

public class ByteCodeClassLoader extends ClassLoader {

    //类名 -> 字节码持有者
    private final Map<String, ByteCodeHolder> classes = new HashMap<>();

    public ByteCodeClassLoader(final ClassLoader parentClassLoader){
        super(parentClassLoader);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        //根据类名取得该类的字节码
        ByteCodeHolder holder = classes.get(name);
        if (holder != null){
            byte[] bytes = holder.getByteCode();
            classes.remove(name);
            //调用父类的defineClass方法完成类的加载
            return defineClass(name, bytes, 0, bytes.length);
         }
        return super.findClass(name);
    }

    public void add(final String name , final ByteCodeHolder holder){
        classes.put(name, holder);
    }
}
