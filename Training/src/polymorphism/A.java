package polymorphism;

public class A {
	public A fun() {
	System.out.println("having fun");
	return(this);
	}

}
 class B extends A {
	 public A fun() {
		 System.out.println("calling method B");
		 return(this);
	 }
 }
 class Test{
	 public static void main(String[] args) {
		B obj=new B();
	   obj.fun();
	}
 }
