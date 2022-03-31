package stringInJava;

public class ToCharArray {
	public static void main(String[] args) {
		String str="        I am Parvin           ";
		char[] ch=str.toCharArray();
		System.out.println(ch.length);
//		for(int i=0;i<=ch.length-1;i++) {
//			System.out.println(ch[i]);
//		}
		for(char c:ch) {
			System.out.println(c);
		}
		System.out.println(str);
		System.out.println(str.trim());
	}

}
