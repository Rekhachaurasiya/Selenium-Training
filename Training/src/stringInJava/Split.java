package stringInJava;

public class Split {
	public static void main(String[] args) {
		String str="I am Parvin makanddar";
		String[] stringsplit=str.split("\\s");
		for(int i=stringsplit.length-1;i>=0;i--) {
			System.out.print(" "+stringsplit[i]);
		}
//		for(String s:stringsplit) {
//			System.out.println(s);
//		}
	}

}
