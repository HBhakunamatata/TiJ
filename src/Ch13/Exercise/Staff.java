package Ch13.Exercise;

import java.util.ArrayList;

public class Staff extends ArrayList<Position> {

    public Staff (String ... titles) {
        for (String title : titles) {
            add(new Position(title));
        }
    }

    public void add (String title, Person person) {
        add(new Position(title, person));
    }

    public void add (String ... titles) {
        for (String title : titles) {
            add(new Position(title));
        }
    }

    public boolean isPositionAvailable (String title) {
        for (Position p : this) {
            if (p.getPerson().equals(title)
                && p.getPerson() == Person.Null) {
                return true;
            }
        }
        return false;
    }

    public void fillPosition (String title, Person hire) {
        for (Position p : this) {
            if (p.getTitle().equals(title)
                    && p.getPerson() == Person.Null) {
                p.setPerson(hire);
            }
        }
        throw new RuntimeException("Position " + title + " not available");
    }

    public static void main(String[] args) {

    }

}
