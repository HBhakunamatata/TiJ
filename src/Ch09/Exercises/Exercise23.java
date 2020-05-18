package Ch09.Exercises;

interface U {
    void f1();
    void f2();
    void f3();
}

class A {
    public U getU() {
        return new U() {
            @Override
            public void f1() {
                System.out.println("f1()...");
            }

            @Override
            public void f2() {
                System.out.println("f2()...");
            }

            @Override
            public void f3() {
                System.out.println("f3()...");
            }
        };
    }
}

class B {
    private int i;
    private U[] items;
    B(int size){
        items = new U [size];
    }
    public void addU(U u){
        items[i++] = u;
    }
    public void setNull(int index){
        items[index] = null;
    }
    public void callBack(){
        for(U i : items){
            i .f1();
            i.f2();
            i.f3();
        }
    }
}


public class Exercise23 {
}
