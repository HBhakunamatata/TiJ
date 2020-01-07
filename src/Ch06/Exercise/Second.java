package Ch06.Exercise;

class First {
    private String s;
    First() {
        s = "First has contructed";
    }

    @Override
    public String toString() {
        return s;
    }
}

public class Second {
    private First first;
    Second(){
        System.out.println("Second constructor");
    }

    @Override
    public String toString() {
        if (first == null){         // lazy initialization
            first = new First();
        }
        return "First info = " + first;
    }

    public static void main(String[] args) {
        Second second = new Second();
        System.out.println(second);
    }
}
