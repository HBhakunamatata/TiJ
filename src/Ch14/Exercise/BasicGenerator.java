package Ch14.Exercise;

import net.mindview.util.Generator;

public class BasicGenerator <T> implements Generator <T> {

    private Class<T> type;

    public BasicGenerator (Class<T> type) {
        this.type = type;
    }

    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // Produce a generator to avoid 'new BasicGenerator(type)'
    public static <T> Generator<T> create(Class <T> type) {
        return new BasicGenerator <T> (type);
    }


    public static void main(String[] args) {
        Generator generator = BasicGenerator.create(CountedObject.class);
        for (int i = 0; i < 10; i++) {
            System.out.println(generator.next());
        }
    }
}