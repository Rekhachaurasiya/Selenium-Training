package practice;

public class Swapping2Nousing3rdVar {
	public static void main(String[] args) {
		int a=20,b=10,temp;
		System.out.println("before swapping a = "+a+ " b = " +b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping a = "+a+ " b = " +b);
	}

}
