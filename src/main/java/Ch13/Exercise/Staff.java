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

    public boolean positionAvailable (String title) {
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
                return;
            }
        }
        throw new RuntimeException("Position " + title + " not available");
    }

    public static void main(String[] args) {
        Staff staff = new Staff("President", "CTO",
            "Marketing Manager", "Product Manager",
            "Project Lead", "Software Engineer",
            "Software Engineer", "Software Engineer",
            "Software Engineer", "Test Engineer",
            "Technical Writer"
        );
        //System.out.println(staff);
        staff.fillPosition("President",
                new Person("Me", "Last", "The Top, Lonely At"));
        staff.fillPosition("Project Lead",
                new Person("Janet", "Planner", "The Burbs"));
        if(staff.positionAvailable("Software Engineer"))
            staff.fillPosition("Software Engineer",
                    new Person("Bob", "Coder", "Bright Light City"));
        System.out.println(staff);
    }

}
