package Ch14.Exercise;

import net.mindview.util.FiveTuple;

public class Exercise03 {
    class SixTuple <A, B, C ,D , E, F> extends FiveTuple <A, B, C, D, E>{

        public final Object sixth;
        public SixTuple(A a, B b, C c, D d, E e, F sixth) {
            super(a, b, c, d, e);
            this.sixth = sixth;
        }

        @Override
        public String toString() {
            return "(" + this.first + ", " + this.second + ", " + this.third +
                    ", " + this.fourth + ", " + this.fifth + ", " + this.sixth
                    + ")";
        }
    }
}
