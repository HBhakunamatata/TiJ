package Ch11.Exercise;

public class Cleanup {

    public static void main(String[] args) {

        //System.out.println(System.getProperty("user.dir"));

        String s;

        try {
            InputFile handler = new InputFile("src//Ch11//Exercise//Cleanup.java");

            try {
                while ( (s = handler.getLine()) != null  ) {
                    ;
                }
            } catch (Exception e) {
                System.out.println("Failed in reading lines");
                e.printStackTrace();
            } finally {
                handler.dispose();
            }

        } catch (Exception e) {
            System.out.println("Failed in opening file");
            e.printStackTrace();
        }
    }
}
