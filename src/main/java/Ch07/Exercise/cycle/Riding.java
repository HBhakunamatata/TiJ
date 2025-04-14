package Ch07.Exercise.cycle;

public class Riding {
    static void ride (Cycle c){
        c.work();
    }
    static int wheels(Cycle c) {
        return c.getWhells();
    }
    public static void main(String[] args) {
        Bicycle najin = new Bicycle();
        Riding.ride(najin);
        System.out.println("The wheels is " + Riding.wheels(najin));
    }
}
