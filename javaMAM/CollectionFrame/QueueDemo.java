package CollectionFrame;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue q = new PriorityQueue<String>();
        q.add("Chaitanya");
        q.add("Shishir");
        q.add("Arjun");
        q.add("Sanket");
        System.out.println(q);
        // System.out.println("Head : " + q.element());
        // System.out.println("Remove Head : " + q.poll());
        // System.out.println("Current Head : " + q.peek());
        // Iterator it = q.iterator();
        // while (it.hasNext()) {
        // System.out.println(it.next());
        // }
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.remove());
        System.out.println(q);
        
    }
}
