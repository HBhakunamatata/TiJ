package Ch11.Exercise;

/*
  Create a class called FailingConstructor with a constructor that might
  fail partway through the construction process and throw an exception.
  In main( ), write code that properly guards against this failure.
 */

class FailConstructor {
    FailConstructor(int index) throws ConstructionException {
        if(index % 2 == 1) {
            throw new ConstructionException();
        }else {
            System.out.println("Construction succeed");
        }
    }

}

public class Exercise22 {
    public static void main(String[] args) {
        try{
            FailConstructor fc = new FailConstructor(2);
            try {
                //
            } finally {
                System.out.println("Release FailConstructor");
            }
        } catch (Exception e) {
            System.out.println("Construction failed");
            e.printStackTrace();
        }
    }
}
