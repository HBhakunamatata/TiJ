package Ch11.Exercise;

class ConstructionException extends Exception {

}

class NeedsCleanup {
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("NeedsCleanup " + id + "disposed");
    }
}

class NeedsCleanup2 extends NeedsCleanup {
    public NeedsCleanup2() throws ConstructionException { }
}

public class CleanupIdiom {

    public static void main(String[] args) {
        // Section1
        NeedsCleanup nc1 = new NeedsCleanup();
        try {
            // ...
        } finally {
            nc1.dispose();
        }

        // Section2


        // Section3
        try {
            NeedsCleanup2 nc4 = new NeedsCleanup2();
            try {
                NeedsCleanup2 nc5 = new NeedsCleanup2();
                try {
                    // ...
                } finally {
                    nc5.dispose();
                }
            } catch (ConstructionException e){
                e.printStackTrace();
            } finally {
                nc4.dispose();
            }
        } catch (ConstructionException e) {
            e.printStackTrace();
        }
    }

}
