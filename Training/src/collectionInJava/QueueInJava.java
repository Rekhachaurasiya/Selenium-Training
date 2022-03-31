package collectionInJava;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInJava {
	public static void main(String[] args) {
		Queue<String> q=new PriorityQueue<String>();
		q.add("Parvin");
		q.add("Bindu");
		q.offer("Gowda");
		q.poll();
		System.out.println(q.peek());
		System.out.println(q);
		Queue<Integer> q1=new PriorityQueue<Integer>();
		q1.add(98);
		q1.add(78);
		q1.add(34);
		q1.add(23);
		q1.offer(12);
		q1.add(10);
		System.out.println(q1.poll());
		System.out.println(q1.peek());
		System.out.println(q1.poll());
		System.out.println(q1.peek());
		System.out.println(q1);
	}

}
