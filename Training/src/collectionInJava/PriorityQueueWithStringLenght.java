package collectionInJava;

import java.util.Iterator;
import java.util.PriorityQueue;

 class Emp implements Comparable<Emp>{
	private int id;
	private String name;
	public Emp(String name, int id) {
		this.name=name;
		this.id=id;
	}
	@Override
	public int compareTo(Emp emp) {
		if(id<emp.id)
			return -1;
		else if(id>emp.id)
			return 1;
		return 0;
	}
	@Override
	public String toString() {
		String result="Emp_name: "+name+", Emp_id: "+id;
		return result;
	}
 }
  public class PriorityQueueWithStringLenght{
	public static void main(String[] args) {
	PriorityQueue<Emp> pq=new PriorityQueue<Emp>();
	pq.add(new Emp("Parvin", 3));
	pq.add(new Emp("Makaandar", 4));
	pq.add(new Emp("Bindu", 1));
	pq.add(new Emp("Gowda", 2));
	pq.add(new Emp("Rekha", 5));
	pq.add(new Emp("Chaurasiya", 6));
	System.out.println(pq.size());
	Iterator<Emp> itr=pq.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		//System.out.println(pq.poll().toString());
	}
	}
  }
	



