package Ch07.Exercise.cycle;

public class Bicycle extends Cycle {
    @Override
    public void work() {
        System.out.println("This is a bicycle");
    }

    @Override
    public int getWhells() {
        return 2;
    }
}
