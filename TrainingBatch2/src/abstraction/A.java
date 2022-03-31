package abstraction;

public abstract class A {
	
	void eat() {
		System.out.println("This is non-abstract method");
		System.out.println("this is also called concrete method");
	}
	
	 abstract void run();
}
class B extends A{
	void run() {
		System.out.println("Implementation of abstract method");
	}
}

class TestAbstractKeyword{
	public static void main(String[] args) {
		A obj=new B();
		obj.eat();
		obj.run();
	}
}

