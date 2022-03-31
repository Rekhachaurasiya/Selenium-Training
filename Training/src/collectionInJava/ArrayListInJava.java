package collectionInJava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListInJava {
	public static void main(String[] args) {
		List<Character> al=new LinkedList<Character>();
		ArrayList<String> list=new ArrayList<String>();
		al.add('f');
		al.add('f');
		al.add('k');
		al.add('f');
		al.add('f');
		al.add('f');
		al.add('h');
		System.out.println(al);
		al.remove(2);		
		System.out.println(al);
		list.add("Parvin");
		list.add("Bindu");
		list.add("Rekha");
		list.remove(1);
		list.remove(1);
		System.out.println(list);
	}

}
