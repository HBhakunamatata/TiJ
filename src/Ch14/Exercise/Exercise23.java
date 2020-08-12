package Ch14.Exercise;

// Modify FactoryConstraint.java so that create() takes an argument.

interface ArgFactory <T> {
    T create(String arg);
}

class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Foo3 <T> {

    T floatNumber;

    public <F extends ArgFactory<T>> Foo3 (F factory, String s) {
        floatNumber = factory.create(s);
        System.out.println(floatNumber);
    }
}

class StudentFactory implements ArgFactory <Student>  {

    @Override
    public Student create(String arg) {
        return new Student(arg);
    }
}

class Teacher {
    private String teaName;
    public Teacher (String teaName) {
        this.teaName = teaName;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teaName='" + teaName + '\'' +
                '}';
    }

    public static class TeacherFactory implements ArgFactory <Teacher> {

        @Override
        public Teacher create(String arg) {
            return new Teacher(arg);
        }
    }
}

public class Exercise23 {

    public static void main(String[] args) {
        new Foo3<Teacher>(new Teacher.TeacherFactory(), "ww");
        new Foo3<Student>(new StudentFactory(), "gd");
    }

}
