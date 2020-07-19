package Ch14.Exercise;

import net.mindview.util.FiveTuple;

public class Exercise03 {
    class SixTuple <A, B, C ,D , E, F> extends FiveTuple <A, B, C ,D , E>{

        public final Object e;
        public SixTuple(A a, B b, C c, D d, E e) {
            super(a, b, c, d, e);
            this.e = e;
        }

        @Override
        public String toString() {
            return "SixTuple{" +
                    "e=" + e +
                    ", fifth=" + fifth +
                    ", fourth=" + fourth +
                    ", third=" + third +
                    ", first=" + first +
                    ", second=" + second +
                    '}';
        }
    }
}
