package Ch06.Exercise;

class LittleLazy {
    private String name;

    LittleLazy(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class LazyInitialization {
    private LittleLazy littleLazy;

    @Override
    public String toString() {
        if (null == littleLazy) {
            littleLazy = new LittleLazy("default");
        }
        return littleLazy.toString();
    }

    public static void main(String[] args) {
        LazyInitialization demo = new LazyInitialization();
        System.out.println(demo);
    }
}
