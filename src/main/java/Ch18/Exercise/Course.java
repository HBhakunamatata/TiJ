package Ch18.Exercise;

import net.mindview.util.Enums;

import static net.mindview.util.Print.print;

public enum Course {

    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    private Food [] values;

    Course (Class <? extends Food> foodKind ) {
        values = foodKind.getEnumConstants();
    }

    public Food randomSelection () {
        return Enums.random(values);
    }

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            for (Course course : Course.values()) {
                print(course.randomSelection());
            }
            print("------------------");
        }
    }

}
