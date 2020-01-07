package Ch07.Exercise.cycle;

public class Tricycle extends Cycle {
    @Override
    public void work() {
        System.out.println("This is a tricycle");
    }

    @Override
    public int getWhells() {
        return 3;
    }
}
