package collectionInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapInjava {
	public static void main(String[] args) {
		Map<Integer,String> hm=new TreeMap<>();
		hm.put(1, "Parvin");
		hm.put(1, "Bindu");
		hm.put(2, "Gowda");
		hm.put(2, "Makaandar");
		hm.put(5, "Rekha");
		hm.put(89, "Bindu");
		hm.put(45, "Bindu");
		hm.put(34, "Bindu");
		hm.put(67, "Bindu");
		System.out.println(hm);
//		Set s=hm.entrySet();
//		Iterator itr=s.iterator();
//		while (itr.hasNext()) {
//			System.out.println("Output using Iterator :"+itr.next());
//		}
		for(Map.Entry map:hm.entrySet()) {
			System.out.println(map.getKey()+" "+map.getValue());
		}
			
		}
	}


