package Ch19.Exercise;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseCaseTracer {
    public static void
    traceUseCase (List<Integer> ids, Class<?> clz) {
        for (Method m : clz.getDeclaredMethods()) {
            UseCase useCase = m.getAnnotation(UseCase.class);
            if (useCase != null) {
                System.out.println("Found use case : "
                + useCase.id() + " " + useCase.description());
                ids.remove(useCase.id());
            }
        }
        for (Integer i : ids) {
            System.out.println("System.out.println(\"Warning: Missing use case-\" + i);");
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases, 47, 48, 49, 50);
        traceUseCase(useCases, PasswordUtils.class);
    }

}
