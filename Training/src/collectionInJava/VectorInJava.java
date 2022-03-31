package collectionInJava;

import java.util.Stack;
import java.util.Vector;

public class VectorInJava {
public static void main(String[] args) {
	Vector<String> vl=new Vector<String>();
	vl.add("Parvin");
	vl.add("Makaandar");
	System.out.println(vl);
	
	Stack<String> sl=new Stack<String>();
	sl.add("Bindu");
	sl.add("Gowda");
	sl.add("Rekha");
	sl.add("Chaurasiya");
	sl.push("Parvin");
	sl.push("Chaurasiya");
	System.out.println(sl.pop());
	System.out.println(sl.peek());
    System.out.println(sl.pop());
	
	System.out.println(sl);
}
}
