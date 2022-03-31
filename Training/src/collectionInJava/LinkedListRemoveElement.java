package collectionInJava;

import java.util.LinkedList;

public class LinkedListRemoveElement {
  public static void main(String[] args) {
	LinkedList<String> ll=new LinkedList<String>();
	System.out.println(ll);
	
	ll.add("Parvin");
	ll.add("Makaandar");
	ll.add("Bindu");
	ll.add("Gowda");
	ll.add("Indra");
	ll.add("Gowda");

	System.out.println(ll);
	
   // ll.remove("Gowda");
    ll.remove(5);
    ll.remove(1);
    ll.add(1, "Makaandar");
    ll.addFirst("Engineer");
    System.out.println(ll);
    
    LinkedList<String> ll1=new LinkedList<String>();
    ll1.add("Rekha");
    ll1.add("Chaurasiya");
    System.out.println(ll1);
    ll.addAll(1, ll1);
    System.out.println(ll);
}
}
