package stringInJava;

public class StringPalindrom {
	public static void main(String[] args) {
		String str="level";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse)) {
			System.out.println("String is palindrom");
		}
		else
			System.out.println("String is not palindrom");
		
	}

}
