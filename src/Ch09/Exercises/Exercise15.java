package Ch09.Exercises;

class Bridge {
    private int weighing;
    public Bridge(int weighing){
        this.weighing = weighing;
    }
}

public class Exercise15 {
    public Bridge getBridge(int num){
        return new Bridge(num){
            private int weighing;
            {
                if(num > 200){
                    System.out.println("Over weight");
                }
            }
        };
    }

    public static void main(String[] args) {
        Exercise15 exercise = new Exercise15();
        Bridge bridge = exercise.getBridge(22);
    }

}
