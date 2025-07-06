package Ch10.Exercise.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @description:
 * @author: Mr.Han
 * @create: 2025-07-05 17:54
 */

public class QueueDemo {

    static <T> void printQueue(Queue<T> queue) {
        T queueNumber = null;
        while ((queueNumber = queue.poll()) != null) {
            System.out.print(queueNumber + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < 10; i++) {
            queue.offer(rand.nextInt(i + 10));
        }
        printQueue(queue);

        Queue<Character> characterQueue = new LinkedList<>();
        for (Character c : "Disnauitueo".toCharArray()) {
            characterQueue.offer(c);
        }
        printQueue(characterQueue);
    }

}
