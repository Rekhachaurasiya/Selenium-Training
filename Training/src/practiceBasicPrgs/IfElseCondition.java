package practiceBasicPrgs;

import java.util.Scanner;

public class IfElseCondition {
	public static void main(String[] args) {
		System.out.println("Enter your age : ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("you can drive a vehicle");
		}
		else
		{
			System.out.println("you can't drive a vehicle");
		}
	}

}
