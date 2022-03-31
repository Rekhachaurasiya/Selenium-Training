package practiceBasicPrgs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateOccurance {
	public void dupCharInString(String str) {
		Map<Character,Integer> dupMap=new HashMap<>();
		char[] c=str.toCharArray();
		for(Character ch:c) {
			if(dupMap.containsKey(ch)) {
				dupMap.put(ch, dupMap.get(ch)+1);	
			}
			else
			{
				dupMap.put(ch, 1);
			}
		}
		
		Set<Character> keys=dupMap.keySet();
		for(Character cha:keys) {
			if(dupMap.get(cha)>1) {
				System.out.println(cha+ " = "+dupMap.get(cha));
		}
	}
}
	public static void main(String[] args) {
		DuplicateOccurance dupOcc=new DuplicateOccurance();
		dupOcc.dupCharInString("Chaurasiyahsscc");
		
	}

}
