package Ch14.Exercise;

class Building {}
class Apartment extends Building {}

public class ClassTypeCapture <T> {
    private Class <T> field;

    public ClassTypeCapture (Class field) {
        this.field = field;
    }

    public boolean judge (T obj) {
        return field.isInstance(obj);
    }

    public static void main(String[] args) {
        ClassTypeCapture <Building> cc1 = new ClassTypeCapture<>(Building.class);
        System.out.println(cc1.judge(new Building()));
        System.out.println(cc1.judge(new Apartment()));

        ClassTypeCapture <Apartment> cc2 = new ClassTypeCapture<>(Apartment.class);
        // System.out.println(cc2.judge(new Building()));
        System.out.println(cc2.judge(new Apartment()));

    }


    // 说白了，java的泛型擦除让使用者在运行期无法取得类型信息，
    // 所以要想在运行期使用类型信息只能把类型信息记下来了。。。
}
