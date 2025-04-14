package Ch15.Exercise;

class ClassParameter <T> {
    public T [] f ( T [] arg ) {
        return arg;
    }
}

class MethodParameter <T> {
    public <T> T [] f ( T [] arg ) {
        return arg;
    }
}

public class ParameterizedArrayType {
    public static void main(String[] args) {
        Integer [] integers = {1, 2, 3, 4, 5, 6};
        Double [] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};

        Integer[] i2 = new ClassParameter<Integer>().f(integers);
        Double[] d2 = new MethodParameter<Double>().f(doubles);

    }
}
