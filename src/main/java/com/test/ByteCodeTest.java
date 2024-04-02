package com.test;

import bytecode.ClassFileAnalysisMain;
import bytecode.type.*;
import bytecode.util.*;
import com.sun.tools.internal.jxc.ap.Const;
import org.junit.Test;
import org.springframework.security.web.context.SaveContextOnUpdateOrErrorResponseWrapper;
import scala.io.BytePickle;

import javax.xml.bind.SchemaOutputResolver;
import java.nio.ByteBuffer;

public class ByteCodeTest {

    @Test
    public void testMagicAndVersionHandler() throws Exception {
        ByteBuffer codeBuf = ClassFileAnalysisMain.readFile("D:\\workspace\\localTest\\src\\main\\java\\jvm\\TestClass.class");
        ClassFile classFile = ClassFileAnalysiser.analysis(codeBuf);
        System.out.println(classFile.getMagic().toHexString());
        System.out.println(classFile.getMinor_version().toInt());
        System.out.println(classFile.getMajor_version().toInt());
    }

    @Test
    public void testConstantPoolHandler() throws Exception{
        ByteBuffer codeBuf = ClassFileAnalysisMain.readFile("D:\\workspace\\localTest\\src\\main\\java\\jvm\\TestClass.class");
        ClassFile classFile = ClassFileAnalysiser.analysis(codeBuf);
        int cp_info_count = classFile.getConstant_pool_count().toInt();
        System.out.println("常量池中常量项总数： " + cp_info_count);
        CpInfo[] cpInfo = classFile.getConstant_pool();
        for (CpInfo cp : cpInfo){
            System.out.println(cp.toString());
        }
    }

    @Test
    public void testAccessFlagsHandler() throws Exception{
        ByteBuffer codeBuf = ClassFileAnalysisMain.readFile("D:\\workspace\\localTest\\src\\main\\java\\jvm\\TestClass.class");
        ClassFile classFile = ClassFileAnalysiser.analysis(codeBuf);
        U2 accessFlags = classFile.getAccess_flags();
        System.out.println(ClassAccessFlagUtils.toClassAccessFlagsString(accessFlags));
    }

    @Test
    public void testThisAndSuperHandler() throws Exception{
        ByteBuffer codeBuf = ClassFileAnalysisMain.readFile("D:\\workspace\\localTest\\src\\main\\java\\jvm\\TestClass.class");
        ClassFile classFile = ClassFileAnalysiser.analysis(codeBuf);
        //this_class
        U2 this_class = classFile.getThis_class();
        //根据this_class 到常量池获取CONSTANT_Class_info常量
        //由于常量池的索引是从1开始的，所以需要将索引减1取得数组下标
        CONSTANT_Class_info this_class_cpInfo = (CONSTANT_Class_info) classFile.getConstant_pool()[this_class.toInt() - 1];

        CONSTANT_Utf8_info this_class_name = (CONSTANT_Utf8_info) classFile.getConstant_pool()[this_class_cpInfo.getName_index().toInt() - 1];

        System.out.println(this_class_name);

        //super_class
        U2 super_class = classFile.getSuper_class();
        CONSTANT_Class_info super_class_cpInfo = (CONSTANT_Class_info) classFile.getConstant_pool()[super_class.toInt() - 1];
        CONSTANT_Utf8_info super_class_name = (CONSTANT_Utf8_info) classFile.getConstant_pool()[super_class_cpInfo.getName_index().toInt() - 1];
        System.out.println(super_class_name);
    }

    @Test
    public void testInterfacesHandler() throws Exception {
        ByteBuffer codeBuf = ClassFileAnalysisMain.readFile("D:\\workspace\\localTest\\src\\main\\java\\jvm\\TestClass.class");
        ClassFile classFile = ClassFileAnalysiser.analysis(codeBuf);
        System.out.println("接口总数：" + classFile.getInterfaces_count().toInt());
        if (classFile.getInterfaces_count().toInt() == 0){
            return;
        }
        U2[] interfaces = classFile.getInterfaces();
        //遍历接口表
        for (U2 interfacesIndex : interfaces){
            //根据所以从常量池中取得一个CONSTANT_Class_info常量
            CONSTANT_Class_info interfaces_class_info = (CONSTANT_Class_info) classFile.getConstant_pool()[interfacesIndex.toInt() - 1];
            //根据CONSTANT_Class_info的name_index从常量池取得一个CONSTANT_Utf8_info常量
            CONSTANT_Utf8_info interfaces_class_name_info = (CONSTANT_Utf8_info) classFile.getConstant_pool()[interfaces_class_info.getName_index().toInt() - 1];
            System.out.println(interfaces_class_name_info);
        }
    }

    private static String getName(U2 name_index, ClassFile classFile){
        CONSTANT_Utf8_info name_info = (CONSTANT_Utf8_info) classFile.getConstant_pool()[name_index.toInt() - 1];
        return name_info.toString();
    }
    @Test
    public void  testFieldHandler() throws Exception{
        ByteBuffer codeBuf = ClassFileAnalysisMain.readFile("D:\\workspace\\localTest\\src\\main\\java\\jvm\\TestClass.class");
        ClassFile classFile = ClassFileAnalysiser.analysis(codeBuf);
        System.out.println("字段总数：" + classFile.getFields_count().toInt());
        System.out.println();
        FieldInfo[] fieldInfos = classFile.getFields();
        for (FieldInfo fieldInfo : fieldInfos){
            System.out.println("访问标志和属性：" + FieldAccessFlagUtils.toFieldAccessFlagsString(fieldInfo.getAccess_flags()));
            System.out.println("字段名：" + getName(fieldInfo.getName_index(), classFile));
            System.out.println("字段的类型描述符：" + getName(fieldInfo.getDescriptor_index(), classFile));
            System.out.println("属性总数：" + fieldInfo.getAttributes_count().toInt());
            System.out.println();
        }
    }

    @Test
    public void testMethodHandler() throws Exception{
        ByteBuffer codeBuf = ClassFileAnalysisMain.readFile("D:\\workspace\\localTest\\src\\main\\java\\jvm\\TestClass.class");
        ClassFile classFile = ClassFileAnalysiser.analysis(codeBuf);
        System.out.println("方法总数：" + classFile.getMethods_count().toInt());
        System.out.println();
        MethodInfo[] methodInfos = classFile.getMethods();
        for (MethodInfo methodInfo : methodInfos){
            System.out.println("访问标志和属性：" + FieldAccessFlagUtils.toFieldAccessFlagsString(methodInfo.getAccess_flags()));
            System.out.println("方法名：" + getName(methodInfo.getName_index(), classFile));
            System.out.println("方法的类型描述符：" + getName(methodInfo.getDescriptor_index(), classFile));
            System.out.println("属性总数：" + methodInfo.getAttributes_count().toInt());
            System.out.println();
        }
    }

    @Test
    public void testAllHandler() throws Exception{
        ByteBuffer codeBuf = ClassFileAnalysisMain.readFile("D:\\workspace\\localTest\\src\\main\\java\\jvm\\TestClass.class");
        ClassFile classFile = ClassFileAnalysiser.analysis(codeBuf);
    }


    @Test
    public void testConstantValue() throws Exception{
        ByteBuffer codeBuf = ClassFileAnalysisMain.readFile("D:\\workspace\\localTest\\src\\main\\java\\jvm\\TestClass.class");
        ClassFile classFile = ClassFileAnalysiser.analysis(codeBuf);
        FieldInfo[] fieldInfos = classFile.getFields();
        for (FieldInfo fieldInfo : fieldInfos){
            AttributeInfo[] attributeInfos = fieldInfo.getAttributes();
            if (attributeInfos == null || attributeInfos.length == 0){
                continue;
            }
            System.out.println("字段：" + classFile.getConstant_pool()[fieldInfo.getName_index().toInt() - 1]);
            for (AttributeInfo attributeInfo : attributeInfos){
                U2 name_index = attributeInfo.getAttribute_name_index();
                CONSTANT_Utf8_info name_info = (CONSTANT_Utf8_info) classFile.getConstant_pool()[name_index.toInt() - 1];
                String name = new String(name_info.getBytes());
                if(name.equalsIgnoreCase("ConstantValue")){
                    ConstantValue_attribute constantValue = AttributeProcessingFactory.processingConstantValue(attributeInfo);
                    U2 cv_index = constantValue.getConstantvalue_index();
                    Object cv = classFile.getConstant_pool()[cv_index.toInt() - 1];
                    if (cv instanceof CONSTANT_Utf8_info){
                        System.out.println("ConstantValue: " + cv.toString());
                    }else if(cv instanceof CONSTANT_Integer_info){
                        System.out.println("ConstantValue: " + ((CONSTANT_Integer_info) cv).getBytes().toInt());
                    }else if (cv instanceof CONSTANT_Float_info){
                        //todo
                    }else if (cv instanceof CONSTANT_Long_info){
                        //todo
                    }else if (cv instanceof CONSTANT_Double_info){
                        //todo
                    }
                }
            }
        }
    }
    @Test
    public void testCodeAttribute() throws Exception {
        ByteBuffer codeBuf = ClassFileAnalysisMain.readFile("D:\\workspace\\localTest\\src\\main\\java\\jvm\\TestClass.class");
        ClassFile classFile = ClassFileAnalysiser.analysis(codeBuf);
        // 获取方法表
        MethodInfo[] methodInfos = classFile.getMethods();
        // 遍历方法表
        for (MethodInfo methodInfo : methodInfos) {
            // 获取方法的属性表
            AttributeInfo[] attributeInfos = methodInfo.getAttributes();
            if (attributeInfos == null || attributeInfos.length == 0) {
                continue;
            }
            System.out.println("方法：" + classFile.getConstant_pool()[methodInfo.getName_index().toInt() - 1]);
            // 遍历属性表
            for (AttributeInfo attributeInfo : attributeInfos) {
                // 获取属性的名称
                U2 name_index = attributeInfo.getAttribute_name_index();
                CONSTANT_Utf8_info name_info = (CONSTANT_Utf8_info) classFile.getConstant_pool()[name_index.toInt() - 1];
                String name = new String(name_info.getBytes());
                // 对Code属性二次解析
                if (name.equalsIgnoreCase("Code")) {
                    // 属性二次解析
                    Code_attribute code = AttributeProcessingFactory.processingCode(attributeInfo);
                    System.out.println("操作数栈大小：" + code.getMax_stack().toInt());
                    System.out.println("局部变量表大小：" + code.getMax_locals().toInt());
                    System.out.println("字节码数组长度：" + code.getCode_length().toInt());
                    System.out.println("字节码：");
                    System.out.println(HexStringUtils.toHexString(code.getCode()));
                    for (byte b : code.getCode()) {
                        System.out.print((b & 0xff) + " ");
                    }
                    System.out.println("\n");
                }
            }
        }
    }
}
