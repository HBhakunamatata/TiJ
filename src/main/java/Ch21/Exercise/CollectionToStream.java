package Ch21.Exercise;

import java.util.*;

public class CollectionToStream {
    public static void main(String[] args) {
        List<Bubble> bubbles = Arrays.asList(
            new Bubble(1), new Bubble(2), new Bubble(3)
        );
        System.out.println(
            bubbles.stream()
                .mapToInt(n -> n.i)
                .sum()
        );

        Set<String> words = new HashSet<>(
            Arrays.asList("It's a wonderful day for a pie!".split(" "))
        );

        words.stream()
            .map(i -> i + " ")
            .forEach(System.out::print);

        System.out.println();

        Map<String, Double> m =
            new HashMap<>();
        m.put("pi", 3.14159);
        m.put("lambda", 1.71);
        m.put("delta", 2.71);

        m.entrySet().stream()
            .map(i -> i.getKey() + " : " + i.getValue())
            .forEach(System.out::println);
    }
}
