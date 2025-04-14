package Ch18.Exercise;

import net.mindview.util.Enums;

public enum Meal2 {

    APPETIZER(Food.Appetizer.class),
    MAINCOURSE(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    interface Food {
        enum Appetizer implements Food { SALAD, SOUP, SPRING_ROLLS }
        enum MainCourse implements Food {
            LASAGNE, BURRITO, PAD_THAI,
            LENTILS, HUMMOUS, VINDALOO
        }
        enum Dessert implements Food {
            TIRAMISU, GELATO, BLACK_FOREST_CAKE,
            FRUIT, CREME_CARAMEL
        }
        enum Coffee implements Food {
            BLACK_COFFEE, DECAF_COFFEE, ESPRESSO,
            LATTE, CAPPUCCINO, TEA, HERB_TEA
        }
    }

    private Food [] values;

    Meal2 (Class <? extends Food> foodType) {
        values = foodType.getEnumConstants();
    }

    public Food randomSelect () {
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (Meal2 m : Meal2.values()) {
                System.out.println(
                    m + " : " + m.randomSelect()
                );
            }
            System.out.println("-----------------");
        }
    }
}
