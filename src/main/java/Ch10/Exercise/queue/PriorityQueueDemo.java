package Ch10.Exercise.queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

/**
 * @description:
 * @author: Mr.Han
 * @create: 2025-07-06 14:19
 */

public class PriorityQueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i + 10));
        }
        QueueDemo.printQueue(priorityQueue);


        List<Integer> ints = Arrays.asList(25, 22, 20,
            18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQueue(priorityQueue);

        priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQueue(priorityQueue);


        // String
        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPq = new PriorityQueue<>(strings);
        QueueDemo.printQueue(stringPq);

        stringPq = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringPq.addAll(strings);
        QueueDemo.printQueue(stringPq);

        // unique character
        Set<Character> set = new HashSet<>();
        for (char c : fact.toCharArray()) {
            set.add(c);
        }
        PriorityQueue<Character> charPq = new PriorityQueue<>();
        charPq.addAll(set);
        QueueDemo.printQueue(charPq);

    }

}
