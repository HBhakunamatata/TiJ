package Ch03_ControllingExecution;


import java.util.Collection;

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        Collection<String> collation = new ArrayList<String>();
        collation.add("haha");
        collation.add("jaie");
        collation.add("ajhi");
        for (String s : collation
             ) {
            System.out.println(s);
        }


        String ss = new String("fajifjiejfe");
        for (char c : ss.toCharArray()
             ) {
            System.out.print(c+ " ");
        }
    }
}
