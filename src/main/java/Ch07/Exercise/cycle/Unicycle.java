package Ch07.Exercise.cycle;

public class Unicycle extends Cycle {
    @Override
    public void work() {
        System.out.println("This is an unicycle");
    }

    @Override
    public int getWhells() {
        return 0;
    }
}
