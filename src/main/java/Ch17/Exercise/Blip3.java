package Ch17.Exercise;

import java.io.*;

import static net.mindview.util.Print.print;

public class Blip3 implements Externalizable {

    private String s;
    private int i;

    public Blip3 () {
        System.out.println("Default Constructor");
    }

    public Blip3 (String s, int i) {
        this.s = s;
        this.i = i;
    }

    public String toString() {
        return s + i;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        print("Blip3.writeExternal");
        // You must do this:
        out.writeObject(s);
        out.writeInt(i);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        print("Blip3.readExternal");
        // You must do this:
        String s = in.readUTF();
        int i = in.readInt();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        print("Constructing objects:");
        Blip3 b3 = new Blip3("A String ", 47);
        print(b3);
        ObjectOutputStream o = new ObjectOutputStream(
                new FileOutputStream("Blip3.out"));
        print("Saving object:");
        o.writeObject(b3);
        o.close();
        // Now get it back:
        ObjectInputStream in = new ObjectInputStream(
        new FileInputStream("Blip3.out"));
        print("Recovering b3:");
        b3 = (Blip3)in.readObject();
        print(b3);
    }
}
