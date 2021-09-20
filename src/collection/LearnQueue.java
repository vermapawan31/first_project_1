package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class LearnQueue {

    public static void main(String[] args) {

        Queue<Integer> queue1=new PriorityQueue<>();
        System.out.println(queue1);
        queue1.add(3);
        queue1.add(6);
        queue1.add(7);
        queue1.add(1);
        queue1.add(11);
        queue1.add(4);

        System.out.println(queue1);
    }
}
