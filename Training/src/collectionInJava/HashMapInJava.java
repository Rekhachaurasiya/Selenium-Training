package collectionInJava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapInJava {
	public static void main(String[] args) {
		Map<String,Integer> hs=new LinkedHashMap<>();
		hs.put("Parvin", 1);
		hs.put("Makaandar", 2);
		hs.put("Bindu", 3);
		hs.put("Gowda", 4);
		hs.put("Rekha", 5);
		hs.put("Chaurasiya", 6);
		hs.put("Bindu", 7);
		hs.put("Rekha", 2);
		System.out.println(hs);
	}

}
