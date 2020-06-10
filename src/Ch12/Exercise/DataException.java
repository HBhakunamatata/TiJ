package Ch12.Exercise;

public class DataException extends Exception {

    DataException (int transactionID, int queryID, String message) {
        super( String.format("(t%d, q%d) %s", transactionID, queryID, message) );
    }

    public static void main(String[] args) {
        try{
            throw new DataException(1, 2, "Write failed");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
