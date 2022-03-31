package StringTestInJava;

public class ImmutableString {
	public static void main(String[] args) {
		String str="Avika";
		str=str.concat(" Roy");
		System.out.println(str);
		String str1="Rekha" + " Chaurasiya";
		System.out.println(str1);
		
		String s1=50+10+" Avika" +10+10;
		System.out.println(s1);
		
		String s2="Rekha";
		String s3=" Chaurasiya";
		System.out.println(s2.concat(s3));
		
		
	}

}
