import java.util.*;

public class P5Queue {

    public static void main(String[] args) {

        System.out.println("Queue-------");
        Queue<String> qu = new LinkedList<>();
        qu.add("Akhil");
        qu.add("Alice");
        qu.add("Akhil2");
        System.out.println(qu);
        System.out.println(qu.poll());
        System.out.println(qu);
        System.out.println(qu.peek());

        System.out.println("PriorityQueue-----");

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(0);
        pq.add(67);
        pq.add(90);
        pq.add(-89);
        System.out.println(pq);
        System.out.println(pq.offer(10));   //Offer will not give error if Queue is full . it used to add element into queue

        System.out.println(pq);

        System.out.println("Deque-------");

        Deque<String> deq = new ArrayDeque<>();
        deq.add("one");
        deq.add("two");
        deq.offer("three");
        System.out.println(deq);
        System.out.println(deq.poll());
        System.out.println(deq);
        deq.push("A");
        deq.push("B");
        System.out.println(deq);
    }
    
}
