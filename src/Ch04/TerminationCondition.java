package Ch04;

/*
 *  Using finalize() to detect an object that
 *  hasn’t been properly cleaned up.
 */

class Book {
    boolean checkedOut;
    Book(boolean checkOut){
        this.checkedOut = checkOut;
    }

    void checkedIn(){
        checkedOut = false;
    }

    @Override
    protected void finalize() throws Throwable {
        if (checkedOut) {
            System.out.println("Error : not released");
        }
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        novel.checkedIn();

        new Book(true);
        System.gc();
    }
}
