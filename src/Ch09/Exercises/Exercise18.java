package Ch09.Exercises;

public class Exercise18 {

    private static class Cat{
        private String petName;
        Cat(String name){
            petName = name;
        }
    }

    public static Cat getCat(String s){
        return new Cat(s);
    }

    public static void main(String[] args) {
        Cat cat = getCat("Tom");
    }
}
