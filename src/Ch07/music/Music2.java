package Ch07.music;

/*
 * override instead of upcasting
 *  If you did that, you’d need to write a new tune() for every new-added type of
 *  Instrument in your system.
 */

import java.text.BreakIterator;

public class Music2 {
    static void tune(Stringed s){
        s.play(Note.C_SHARP);
    }
    static void tune(Brass brass){
        brass.play(Note.B_FLAT);
    }
    static void tune(Wind wind){
        wind.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Stringed s = new Stringed();
        Wind w = new Wind();
        Brass b = new Brass();

        Music2.tune(s);
        Music2.tune(b);
        Music2.tune(w);
    }
}
