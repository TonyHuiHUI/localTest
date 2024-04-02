package bytecode.util;

import bytecode.type.U2;

import java.util.HashMap;
import java.util.Map;

public class ClassAccessFlagUtils {
    private static final Map<Integer, String> classAccessFlagMap = new HashMap<>();

    static {
        //公有类型
        classAccessFlagMap.put(0x0001, "public");
        //不允许有子类
        classAccessFlagMap.put(0x0010, "final");
        classAccessFlagMap.put(0x0020, "super");
        //接口
        classAccessFlagMap.put(0x0200, "interface");
        //抽象类
        classAccessFlagMap.put(0x0400, "abstract");
        //该class非java代码编译后生成
        classAccessFlagMap.put(0x1000, "synthetic");
        //注解类型
        classAccessFlagMap.put(0x2000, "annotation");
        //枚举类型
        classAccessFlagMap.put(0x4000, "enum");
    }

    public static String toClassAccessFlagsString(U2 flag){
        final int flagValue = flag.toInt();
        StringBuilder flagBuild = new StringBuilder();
        classAccessFlagMap.keySet().forEach(key -> {
            if ((flagValue & key) == key) {
                flagBuild.append(classAccessFlagMap.get(key)).append(",");
            }
        });
        return flagBuild.length() > 0 && flagBuild.charAt(flagBuild.length() - 1) == ',' ? flagBuild.substring(0, flagBuild.length() - 1) : flagBuild.toString();
    }
}
