package com.test;

import bytecode.visitor.FieldVisitor;
import bytecode.visitor.MethodVisitor;
import bytecode.writer.ClassWriter;

public class ASMTest {
    public static void main(String[] args) {
        ClassWriter classWriter = new ClassWriter();
        classWriter.visit(52, "public", "jvm.TestClassLoader");
        // 添加字段
        FieldVisitor fieldVisitor = classWriter.visitField("private", "name", "Ljava/lang/String;");
        // 为字段添加注解
        fieldVisitor.visitAnnotation("@Getter", true);
        // 添加方法
        MethodVisitor methodVisitor = classWriter.visitMethod("public", "getName", "(Ljava/lang/String)V");
        // 设置局部变量表和操作数栈的大小
        methodVisitor.visitMaxs(1, 1);
        classWriter.showClass();
    }
}
