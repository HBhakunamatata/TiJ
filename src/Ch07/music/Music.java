package Ch07.music;

/*
 * Wind is a type of Instrument
 *
 */

public class Music {
    static void tune(Instrument i){
        // ...
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Instrument flute = new Wind();
        Music.tune(flute);              // Upcasting from Wind to Instrument
    }
}
