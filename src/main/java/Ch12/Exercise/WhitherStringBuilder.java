package Ch12.Exercise;

public class WhitherStringBuilder {
    public String implicit(String [] fields) {
        String s = "";
        for (int i = 0; i < fields.length; i++) {
            s += fields[i];
        }
        return s;
    }

    public String explicit (String [] fields) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            s.append(fields[i]);
        }
        return s.toString();
    }
}
