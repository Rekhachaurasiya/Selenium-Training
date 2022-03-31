package exceptionInJava;

public class FinallyBlockInJava {
	public static void main(String[] args) {
		try {
			int a=10,b=0,c;
			c=a/b;
			System.out.println(c);
		}
		finally {
			System.out.println("I am in finally block");
		}
	}

}
