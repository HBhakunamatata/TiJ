package Ch18.Exercise;

enum Search { HITHER, YON }

public class UpcastEnum {
    public static void main(String[] args) {
        Search[] searches = Search.values();

        Enum search = Search.HITHER; // upcast

        // search.values();        // cannot values()

        for (Enum s : search.getClass().getEnumConstants()) {
            System.out.println(s);
        }

    }
}
