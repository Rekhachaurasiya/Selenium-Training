package controlStatements;

import java.util.Scanner;

public class If_Else_Condition {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age :");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("you can drive a vehicle");
		}
		else
		{
			System.out.println("you can't drive a vehicle");
		}
	}

}
