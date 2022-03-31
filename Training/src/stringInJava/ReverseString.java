package stringInJava;

public class ReverseString {
	public static void main(String[] args) {
		String s="Makaandar";
		String reverse="";
		char[] ch=s.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			reverse=reverse+ch[i];
			
		}
		System.out.print(reverse);
	}

}
