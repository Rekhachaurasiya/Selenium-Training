package stringInJava;

public class Snippet {
		public static void main(String[] args) {
			String str="level";
			String reverse="";
			for(int i=str.length()-1;i>=0;i--) {
				reverse=reverse+str.charAt(i);
			}
			if(str.equals(reverse)) {
				System.out.println("this is palindrom");
			}
			else
				System.out.println("not palindrom");
			
		}
	
	}


