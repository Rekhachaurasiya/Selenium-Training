package stringInJava;

public class SubstringInSting {
	public static void main(String[] args) {
		String s="Parvin Makaandar and I am an engineer";
		System.out.println("Substring : "+s.substring(7,16));
		System.out.println("Index value of character :"+s.charAt(15));
		System.out.println("converting into Upper letter :" +s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println("Removing white space : "+s.trim());
		
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++) {
		System.out.println(str[i]);
		}
		System.out.println(s.contains("Parvin"));
		System.out.println(s.startsWith("P"));
		System.out.println(s.endsWith("r"));
	}

}
