package Ch19.Exercise;


import com.sun.javafx.css.Declaration;
import com.sun.mirror.apt.AnnotationProcessor;
import com.sun.mirror.apt.AnnotationProcessorEnvironment;
import com.sun.mirror.declaration.MethodDeclaration;
import com.sun.mirror.declaration.Modifier;
import com.sun.mirror.declaration.ParameterDeclaration;
import com.sun.mirror.declaration.TypeDeclaration;
import com.sun.mirror.type.DeclaredType;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.List;

public class InterfaceExtractorProcessor
    implements AnnotationProcessor {

    private AnnotationProcessorEnvironment env;
    private List<MethodDeclaration> methodDeclarationList;

    InterfaceExtractorProcessor (AnnotationProcessorEnvironment env) {
        this.env = env;
    }

    @Override
    public void process() {
        for (TypeDeclaration type : env.getSpecifiedTypeDeclarations()) {
            ExtractInterface ann = type.getAnnotation(ExtractInterface.class);
            if (ann == null)
                break;
            for (MethodDeclaration method : type.getMethods()) {
                if (!method.getModifiers().contains(Modifier.STATIC)
                    && method.getModifiers().contains(Modifier.PRIVATE)) {
                    methodDeclarationList.add(method);
                }
            }

            if (methodDeclarationList.size() > 0) {
                // output the file
                try {
                    PrintWriter writer =
                        env.getFiler().createSourceFile(ann.value());
                    writer.println("package " + type.getQualifiedName() + ";");
                    writer.println("public interface " + ann.value() + "{");

                    for (MethodDeclaration method : methodDeclarationList) {
                        writer.print("\tpublic ");
                        writer.print(method.getReturnType() + " ");
                        writer.print(method.getSimpleName() + " (");

                        // index of the element operated now
                        int i = 1;

                        for (ParameterDeclaration param : method.getParameters()) {
                            writer.print( param.getType() + " " + param.getSimpleName() );
                            if (++i <= methodDeclarationList.size())
                                writer.print(", ");
                        }
                        writer.println(");");
                    }

                    writer.println("}");

                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }


        }
    }
}
