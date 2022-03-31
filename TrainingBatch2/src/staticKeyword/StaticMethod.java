package staticKeyword;

public class StaticMethod {
	int empID;
	String name;
	static String company="IBM";
	
	public static void change() {
		company="KPMG";
	}
	
	public static void main(String[] args) {
		StaticMethod.change();
		System.out.println(company);
		
	}

}
