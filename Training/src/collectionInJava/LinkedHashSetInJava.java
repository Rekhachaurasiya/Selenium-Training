package collectionInJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LinkedHashSetInJava {
	public static void main(String[] args) {
		Set<String> lh=new TreeSet<String>();
		lh.add("Pravin");
		lh.add("Bindu");
		lh.add("Pravin");
		lh.add("Makaandar");
		lh.add("Gowda");
		lh.add("Bindu");
		lh.add("Rekha");
		System.out.println(lh);
		
		Set<Integer> lhs=new TreeSet<>();
		lhs.add(3);
		lhs.add(7);
		lhs.add(3);
		lhs.add(8);
		lhs.add(9);
		lhs.add(23);
		lhs.add(56);
		lhs.add(97);
		lhs.add(57);
		System.out.println(lhs.contains(49));
		System.out.println(lhs);
		}
		
	}


