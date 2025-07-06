package Ch10.Exercise;

import static net.mindview.util.Print.*;

import java.util.*;

public class PrintingCollections {

    static Collection fill (Collection<String> c) {
        c.add("rat");
        c.add("cat");
        c.add("dog");
        c.add("dog");
        return c;
    }

    static Map fill ( Map<String, String> map ) {
        map.put("rat", "Fuzzy");
        map.put("cat", "Rags");
        map.put("dog", "Bosco");
        map.put("dog", "Spot");
        return map;
    }

    public static void main(String[] args) {
        print(fill(new ArrayList<String>()));
        print(fill(new LinkedList<String>()));
        print(fill(new HashSet<String>()));
        print(fill(new TreeSet<String>()));
        print(fill(new LinkedHashSet<String>()));
        print(fill(new HashMap<String,String>()));
        print(fill(new TreeMap<String,String>()));
        print(fill(new LinkedHashMap<String,String>()));
    }
}
