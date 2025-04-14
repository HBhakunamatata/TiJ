package Ch14.Exercise;

public class ReturnGenericType <T extends HasF> {
    private T obj;

    public ReturnGenericType(T obj) {
        this.obj = obj;
    }

    public T getT() {
        return obj;
    }


    public static void main(String[] args) {
        HasF hasF = new HasF();
        ReturnGenericType <HasF> test = new ReturnGenericType<>(hasF);
        test.getT().f();
    }
}
