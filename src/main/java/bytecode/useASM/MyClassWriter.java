package bytecode.useASM;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

public class MyClassWriter extends ClassVisitor {

        private ClassWriter classWriter;

        public MyClassWriter(ClassWriter classWriter) {
            super(Opcodes.ASM6, classWriter);
            this.classWriter = classWriter;
        }

        @Override
        public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
            if ("main".equals(name)) {
                // 通过MainMethodWriter()重写main()方法
                MethodVisitor methodVisitor = super.visitMethod(access, name, descriptor, signature, exceptions);
                return new MainMethodWriter(methodVisitor);
                //直接返回null， 剔除了main()方法
//                return null;
            }
            return super.visitMethod(access, name, descriptor, signature, exceptions);
        }

        public byte[] toByteArray() {
            return classWriter.toByteArray();
        }

    }