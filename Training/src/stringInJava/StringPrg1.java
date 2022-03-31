package stringInJava;

public class StringPrg1 {
	public static void main(String[] args) {
		String s1=new String("Parvin");
		String s2=new String("Parvin");
		String s3="Parvin";
		String s4="parvin";
		System.out.println(s1==s2);//false
		System.out.println(s2==s3);//false
		System.out.println(s1.equals(s2));//true
		System.out.println(s2.equals(s3));//true
		System.out.println(s3.equalsIgnoreCase(s4));//true
		
	}

}
