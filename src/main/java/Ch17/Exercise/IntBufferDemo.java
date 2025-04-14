package Ch17.Exercise;

import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class IntBufferDemo {

    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(Util.BSIZE);
        IntBuffer intBuffer = buffer.asIntBuffer();
        intBuffer.put(new int[]{ 11, 42, 47, 99, 143, 811, 1016 });
        System.out.println(intBuffer.get(3));

        intBuffer.put(3, 22);

        intBuffer.flip();

        while (intBuffer.hasRemaining()) {
            System.out.print(intBuffer.get() + " ");
        }
    }
}
