package variables;

public class InstanceVariable {
	String name="Avika";
	String name1="Swati";
	int age=25;
	
	public void speak() {
		System.out.println(name);
		System.out.println(name1);
		System.out.println(age);
	}
	
	public void run() {
		System.out.println(name);
		System.out.println(age);
	}
	public static void main(String[] args) {
		InstanceVariable obj=new InstanceVariable();
		obj.speak();
		obj.run();
	}

}
