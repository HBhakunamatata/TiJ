package Ch18.Exercise;

import static Ch18.Exercise.Spiciness.*;

public class Burrito {

    private Spiciness degree;

    public Burrito (Spiciness degree) {
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Burrito is " + degree + "\n";
    }

    public static void main(String[] args) {
        System.out.println(new Burrito(FLAMING));
        System.out.println(new Burrito(HOT));
        System.out.println(new Burrito(MEDIUM));
    }
}
