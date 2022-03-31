package collectionInJava;

import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		Stack<String> sl=new Stack<String>();
		sl.add("Bindu");
		sl.add("Gowda");
		sl.add("Rekha");
		sl.add("Chaurasiya");
		sl.push("Parvin");
		sl.push("Chaurasiya");
		System.out.println(sl.pop());//It will remove the element
		System.out.println(sl.remove("Bindu"));
		System.out.println(sl.peek());// It will tell you next element whic is going to remove
		System.out.println(sl.pop());
		System.out.println(sl);
	}

}
