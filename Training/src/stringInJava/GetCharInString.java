package stringInJava;

public class GetCharInString {
	public static void main(String[] args) {
		String s=new String("I am an engineer");
		//String str="I am Parvin";
		char[]ch=new char[12];
		try {
		s.getChars(5, 7, ch, 0);
		System.out.println(ch);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
