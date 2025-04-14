package Ch18.Exercise;

import net.mindview.util.Enums;

import static net.mindview.util.Print.print;

public enum SecurityCategory {

    STOCK(Security.Stock.class), BOND(Security.Bond.class);

    interface Security {
        enum Stock implements Security { SHORT, LONG, MARGIN }
        enum Bond implements Security { MUNICIPAL, JUNK }
    }

    Security [] values;

    SecurityCategory (Class <? extends Security> kind) {
        values = kind.getEnumConstants();
    }

    public Security randomAccess () {
        return Enums.random(values);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            SecurityCategory category = Enums.random(SecurityCategory.class);
            print(category + " : " + category.randomAccess());
        }
    }

}
