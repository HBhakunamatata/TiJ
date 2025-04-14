package Ch14.Exercise;



class Subtype extends BasicHolder <Subtype> {}

public class HolderWithCRG {
    public static void main(String[] args) {
        Subtype st1 = new Subtype(), st2 = new Subtype();
        st1.set(st2);
        Subtype st3 = st1.get();
        st3.f();
    }
}
