package stringInJava;

public class InternInString {
	public static void main(String[] args) {
		String s1=new String("Parvin").intern();
		String s2=new String("Parvin").intern();
		System.out.println(s1==s2);
	}

}
