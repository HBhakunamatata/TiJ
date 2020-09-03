package Ch17.Exercise;

import java.nio.ByteBuffer;

import static net.mindview.util.Print.print;

public class GetData {

    public static void main(String[] args) {

        ByteBuffer buffer = ByteBuffer.allocate(Util.BSIZE);

        int i = 0;
        while (i++ < buffer.limit()) {
            if (buffer.get() != 0) {
                print("NonZero");
            }
        }

        print("i = " + i);

        buffer.rewind();

        // Store and read a short:
        buffer.asShortBuffer().put((short)471142);
        print(buffer.getShort());
        buffer.rewind();

        // Store and read an int:
        buffer.asIntBuffer().put(99471142);
        print(buffer.getInt());
        buffer.rewind();

        // Store and read a long:
        buffer.asLongBuffer().put(99471142);
        print(buffer.getLong());
        buffer.rewind();

        // Store and read a float:
        buffer.asFloatBuffer().put(99471142);
        print(buffer.getFloat());
        buffer.rewind();

        // Store and read a double:
        buffer.asDoubleBuffer().put(99471142);
        print(buffer.getDouble());
        buffer.rewind();

    }
}
