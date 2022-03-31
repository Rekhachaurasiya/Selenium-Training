package abstractJava;

public abstract class A {
	A()
	{
		System.out.println("Hi");
	}
	static void run()
	{
		System.out.println("running..");
	}
	void speak()
	{
		System.out.println("speaking");
	}

   abstract void fun();
}
class B extends A{
	 void fun() {
		 System.out.println("hello");
			 
		 }
	 public static void main(String[] args) {
		A obj=new B();
		obj.fun();
		obj.run();
	}
		
	}
	


