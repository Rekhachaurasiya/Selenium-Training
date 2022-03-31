package staticKeyword;

public class StaticNestedClass {
	
	static int data=30;
	
	static class Inner{
		public static void msg() {
			System.out.println("data is :"+data);
		}
		
	}
	
public static void main(String[] args) {
	StaticNestedClass.Inner.msg();
}
}
