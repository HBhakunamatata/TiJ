package Ch17.Exercise;


import java.io.*;

class Blip1 implements Externalizable {
    public Blip1 () {  // constructor must be public
        System.out.println("Blip1 Construction");
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip1 writeExternal");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip1 readExternal");
    }
}

class Blip2 implements Externalizable {
    public Blip2 () {  // constructor must be public
        System.out.println("Blip2 Construction");
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("Blip2 writeExternal");
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("Blip2 readExternal");
    }
}


public class Blips {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Blip1 blip1 = new Blip1();
        Blip2 blip2 = new Blip2();

        ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream(Util.prefix + "Blips.dat")
        );

        out.writeObject(blip1);
        out.writeObject(blip2);

        out.close();

        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(Util.prefix + "Blips.dat")
        );

        Blip1 blip11 = (Blip1) in.readObject();
        Blip2 blip22 = (Blip2) in.readObject();

        in.close();
    }

}
