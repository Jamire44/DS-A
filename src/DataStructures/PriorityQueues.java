package DataStructures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {

        Queue<String> queue = new PriorityQueue<>();

        queue.offer("A");
        queue.offer("C");
        queue.offer("D");
        queue.offer("B");
        queue.offer("E");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

    }//main
}//class
