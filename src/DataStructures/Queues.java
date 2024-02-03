package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>();

        // Adds to the queue
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        // Removes first
        queue.poll();

        // If it contains
        System.out.println(queue.contains("Harold"));

        // Finds the head
        System.out.println(queue.peek());

        // Checks to see if empty
        System.out.println(queue.isEmpty());

        // The size of the queue
        System.out.println(queue.size());

        System.out.println(queue);

    }//main
}//class
