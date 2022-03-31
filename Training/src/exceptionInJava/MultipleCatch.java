package exceptionInJava;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
		int a[]=new int[5];
		a[6]=20/2;
		}catch(ArithmeticException e) {
			System.out.println("arithmetic exception is occuring");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}catch(Exception e) {
			System.out.println("Exception is not been handled");
		}
		System.out.println("hello");
	}

}
