package Ch18.Exercise;

import static net.mindview.util.Print.*;

public enum OzWitch {

    // instances must be defined first, before methods:
    WEST("Miss Gulch, aka the Wicked Witch of the West"),
    NORTH("Glinda, the Good Witch of the North"),
    EAST("Wicked Witch of the East, wearer of the Ruby " +
                 "Slippers, crushed by Dorothy’s house"),
    SOUTH("Good by inference, but missing");

    private String description;

    OzWitch (String description) {
        this.description = description;
    }

    private String getDescription () {
        return description;
    }

    public static void main(String[] args) {
        for (OzWitch oz : OzWitch.values()) {
            System.out.println(oz + " : " + oz.getDescription());
        }
    }
}
