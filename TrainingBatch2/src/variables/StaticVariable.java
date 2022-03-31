package variables;

public class StaticVariable {
	
	static String Company="IBM";
	String name="Avika";
	int age=30;
	int empID=12345;
		
	public void emp() {	
		System.out.println(Company);
		System.out.println(name);
	 }
	public static void main(String[] args) {
		StaticVariable refVar=new StaticVariable();
		refVar.emp();
	}

}
