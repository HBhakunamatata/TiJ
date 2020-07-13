package Ch13.Exercise;

public class Position {
    private String title;
    private Person person;
    public Position (String title, Person person) {
        this.title = title;
        this.person = person;
        if (person == null) {
            person =  Person.Null;
        }
    }

    public Position(String title) {
        this.title = title;
        person = Person.Null;
    }

    public Person getPerson() {
        if (person == null) {
            return Person.Null;
        }
        return person;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String toString() {
        return "Position: " + title + " " + person;
    }
}
