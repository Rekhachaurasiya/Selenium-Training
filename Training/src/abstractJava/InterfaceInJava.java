package abstractJava;

public interface InterfaceInJava {
	 int a =10;
	 void fun();
	 static void run() {
		 System.out.println("this is static method");
	 }
}
class C implements InterfaceInJava{
	public void fun() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		C obj=new C();
		obj.fun();
		InterfaceInJava.run();
	}
}
