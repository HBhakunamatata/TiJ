package Ch07.music;

public class Brass extends Instrument{
    @Override
    public void play(Note n) {
        System.out.println("Brass play() " + n);
    }
}
