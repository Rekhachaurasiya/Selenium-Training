package StringTestInJava;

public class SCPInJava {
	public static void main(String[] args) {
		char c[]= {'A','v','i','k','a'};
		String s=new String(c);
		System.out.println(s);
		String s1="Avika";
		String s2="Avika";
		String s3=new String("Avika");
		String s4=new String("Avika");
		String s5=new String("AVIKA");
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s1==s2);//true
		System.out.println(s3==s4);//false
		System.out.println(s3.equals(s4));//true
		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s5));//true
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
	}

}
