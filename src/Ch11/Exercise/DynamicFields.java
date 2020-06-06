package Ch11.Exercise;

// A Class that dynamically adds fields to itself.
// Demonstrates exception chaining.
import static net.mindview.util.Print.*;

class DynamicFieldException extends Exception { }

public class DynamicFields {
    private Object [][] fields;

    DynamicFields(int initialSize) {
        fields = new Object[initialSize][2];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = new Object[] {null, null};
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Object [] obj : fields) {
            result.append(obj[0]);
            result.append(" : ");
            result.append(obj[1]);
            result.append("\n");
        }
        return result.toString();
    }

    private int hasField (String id) {
        for (int i = 0; i < fields.length; i++) {
            if ( id.equals(fields[i][0]) )
                return i;
        }
        return -1;
    }

    private int getFieldNumber (String value) throws NoSuchFieldException {
        int fieldNum = hasField(value);
        if (fieldNum == -1)
            throw new NoSuchFieldException();
        return fieldNum;
    }

    private int makeField (String id) {
        for (int i = 0; i < fields.length; i++) {
            if(fields[i][0] == null){
                fields[i][0] = id;
                return i;
            }
        }
        Object [][] temp = new Object[fields.length + 1][2];
        for (int i = 0; i < fields.length; i++) {
            temp[i] = fields[i];
        }
        temp[fields.length] = new Object[] {null, null};
        fields = temp;
        return makeField(id);
    }

    public Object getValue (String id) throws NoSuchFieldException {
        return fields[getFieldNumber(id)][1];
    }

    public Object setField(String id, Object value)
        throws DynamicFieldException {
        if ( value == null ){
            // Most exceptions don’t have a "cause" constructor.
            // In these cases you must use initCause(),
            // available in all Throwable subclasses.
            DynamicFieldException dfe = new DynamicFieldException();
            dfe.initCause(new NullPointerException());
            throw dfe;
        }

        int fieldNum = hasField(id);
        if ( fieldNum == -1 ){
            fieldNum = makeField(id);
        }

        Object result = null;
        try {
            result = getValue(id); // Get old value
        } catch(NoSuchFieldException e) {
            // Use constructor that takes "cause":
            throw new RuntimeException(e);
        }
        fields[fieldNum][1] = value;
        return result;
    }

    public static void main(String[] args) {
        DynamicFields df = new DynamicFields(3);
        print(df);
        try {
            df.setField("d", "A value for d");
            df.setField("number", 47);
            df.setField("number2", 48);
            print(df);
            df.setField("d", "A new value for d");
            df.setField("number3", 11);
            print("df: " + df);
            print("df.getValue(\"d\") : " + df.getValue("d"));
            Object field = df.setField("d", null); // Exception
        } catch(NoSuchFieldException e) {
            e.printStackTrace(System.out);
        } catch(DynamicFieldException e) {
            e.printStackTrace(System.out);
        }
    }
}
