package Ch14.Exercise;

/*
  Add a second parameterized exception to the Processor class
  and demonstrate that the exceptions can vary independently.
 */

import com.sun.net.httpserver.Authenticator;

import java.util.*;

interface Processor02 <T, E1 extends Exception, E2 extends Exception>  {
    void process (List<T> resultList) throws E1, E2;
}

class StringProcessor02 implements Processor02 <String, Failure1, Failure2>  {

    static  int count = 3;
    @Override
    public void process(List<String> resultList) throws Failure1, Failure2 {
        if (count-- > 2) {
            resultList.add("Wox");
        }

        if (count-- > 0) {
            throw new Failure1();
        }

        if (count < 0) {
            throw new Failure2();
        }
    }
}

class ProcessRunner <T, E1 extends Exception, E2 extends Exception>
        extends ArrayList < Processor02<T, E1, E2> >{
    public List <T> processAll () throws E1, E2 {
        List<T> resultList = new ArrayList<>();
        for (Processor02<T, E1, E2> p : this) {
            p.process(resultList);
        }

        return resultList;
    }
}


public class Exercise36 {

    public static void main(String[] args) {
        ProcessRunner<String, Failure1,Failure2>
                runner = new ProcessRunner<>();
        for (int i = 0; i < 3; i++) {
            runner.add(new StringProcessor02());
        }
        try {
            runner.processAll();
        } catch (Failure1 | Failure2 exception) {
            exception.printStackTrace();
        }

    }

}
