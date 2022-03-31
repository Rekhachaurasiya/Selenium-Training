package collectionInJava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeueInJava { 
	public static void main(String[] args) {
		Deque<String> dq=new ArrayDeque<String>();
		dq.add("Parvin");
		dq.add("Bindu");
		dq.add("Rekha");
		dq.offer("Indra");
		dq.addFirst("Makaandar");
		dq.addLast("Gowda");
		Iterator<String> itr=dq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

}
