package Ch14.Exercise;

import netscape.security.UserTarget;

import java.util.*;

class Failure1 extends Exception {}

class Failure2 extends Exception {}

interface Processor <T, E extends Exception> {
    void  process (List <T> resultList) throws E;
}

class StringProcessor implements Processor<String, Failure1> {

    static int count = 3;

    @Override
    public void process(List<String> resultList) throws Failure1 {

        if (count-- > 2)
            resultList.add("Wox");
        if (count-- == 0)
            resultList.add("End");
        if (count < 0) {
            throw new Failure1();
        }
    }
}

class IntegerProcessor implements Processor <Integer, Failure2> {

    static int count = 2;

    @Override
    public void process(List<Integer> resultList) throws Failure2 {
        if (count-- > 1)
            resultList.add(55);
        if (count-- == 1)
            resultList.add(4);
        if (count < 0)
            throw new Failure2();
    }
}

class ProcessorRunner <T, E extends Exception>
        extends ArrayList <Processor<T, E>> {
    List <T> resultList = new ArrayList<>();

    public List<T> processAll () throws E {
        for (Processor<T, E> p : this) {
            p.process(resultList);
        }

        return resultList;
    }
}


public class ThrowGenericException {

    public static void main(String[] args) {

        List<String> result1;

        ProcessorRunner <String, Failure1> runner1 =
                new ProcessorRunner<>();
        for (int i = 0; i < 3; i++) {
            runner1.add(new StringProcessor());
        }
        try {
            result1 = runner1.processAll();
            System.out.println(result1);
        } catch (Failure1 failure1) {
            failure1.printStackTrace();
        }

        // runner 02

        List <Integer> result2;

        ProcessorRunner <Integer, Failure2> runner2 =
                new ProcessorRunner<>();
        for (int i = 0; i < 2; i++) {
            runner2.add(new IntegerProcessor());
        }

        try {
            result2 = runner2.processAll();
            System.out.println(result2);
        } catch (Failure2 failure2) {
            failure2.printStackTrace();
        }

    }
}
