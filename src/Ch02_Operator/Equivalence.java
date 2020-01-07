package Ch02_Operator;

class MyInterger1 {
    int n;
    MyInterger1(int n){
        this.n = n;
    }
}

class MyInterger2 {
    int n;
    MyInterger2(int n){
        this.n = n;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof MyInterger2){
            return ((MyInterger2) obj).n == n;
        }
        return false;
    }
}

public class Equivalence {

    public static void main(String[] args) {
        Integer n1 = new Integer(23);
        Integer n2 = new Integer(23);

        System.out.println(n1 == n2);

        System.out.println(n1.equals(n2));

        MyInterger1 m1 = new MyInterger1(23);
        MyInterger1 m2 = new MyInterger1(23);

        System.out.println(m1.equals(m2));

        MyInterger2 q1 = new MyInterger2(23);
        MyInterger2 q2 = new MyInterger2(23);

        System.out.println(q1.equals(q2));


    }
}

/*
 * == compares the reference.
 * when comparing the content, we need use the equals() (but default compare the reference)
 * Only the objects that override the equals() can we compare the contents
 * In eg, the contents of objects are the same, but the reference are different
 */
