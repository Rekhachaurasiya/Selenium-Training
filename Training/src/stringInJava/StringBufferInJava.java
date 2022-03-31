package stringInJava;

public class StringBufferInJava {
	public static void main(String[] args) {
		String s="Parvin";
		s.concat("Makaandar");//String is an immutable object
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer("Parvin");
		sb.append(" Makaandar");//StringBuffer is a mutable object but it a synchronized
	    System.out.println(sb);	
	    
	    StringBuilder stringbuilder=new StringBuilder("Bindu ");
	    stringbuilder.append("Gowda");//StringBuffer is a mutable object but it a non-synchronized
	    System.out.println(stringbuilder);
	}

}
