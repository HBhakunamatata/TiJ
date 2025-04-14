package Ch20.Exercise;


@FunctionalInterface
interface Function {
    String goodbye(String args);
}

interface FunctionalNoAnn {
    String goodbye(String args);
}

public class FunctionalAnnotation {
    String goodbye (String args) {
        return "Goodbye, " + args;
    }

    public static void main(String[] args) {
        FunctionalAnnotation fa = new FunctionalAnnotation();
        Function fwa = fa::goodbye;
        FunctionalNoAnn fna = fa::goodbye;

        // FunctionWithAnn f = fa;

        fwa = (x) -> "Goodbye, " + x;
        fna = (x) -> "Goodbye, " + x;
    }
}
