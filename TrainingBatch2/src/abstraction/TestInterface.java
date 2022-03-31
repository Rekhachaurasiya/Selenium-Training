package abstraction;

public interface TestInterface {
	static int a=10;
	abstract void run();
	static void teach() {
		System.out.println("this is a static method");
	}
	default void speak() {
		System.out.println("this is a default method");
	}
	abstract void walk();
}
interface Test1{
	abstract void drink();
}
class Test implements TestInterface,Test1{
	 public void run() {
		System.out.println("this is 1st abstract method");
	}
	 public void walk()
	 {
		 System.out.println("this is 2nd abstract method");
	 }
	 public void drink() {
		 System.out.println("this is 3rd abstract method");
	 }
}
class TestInterface1{
	public static void main(String[] args) {
		Test obj=new Test();
		obj.run();
		obj.speak();
		obj.walk();
		obj.drink();
		TestInterface.teach();		
		
	}
}

