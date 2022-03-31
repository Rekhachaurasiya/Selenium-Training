package stringInJava;

public class StringReverUsingStringBuffer {
	public static void main(String[] args) {
		String reverse="";
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb.reverse());
		StringBuilder strbuilder=new StringBuilder("Parvin");
		System.out.println(strbuilder.reverse());
		System.out.println(strbuilder.insert(3, 'R'));
	}

}
