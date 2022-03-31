package controlStatements;

import java.util.Scanner;

public class Else_if_condition {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age :");
		Scanner sc=new Scanner(System.in);
		
		age=sc.nextInt();
		if(age>50)
		{
			System.out.println("you are experienced emp");
		}
		else if(age>40) {
			System.out.println("you are semi-experienced emp");
		}
		else if(age>30) {
			System.out.println("you are junior emp");
		}
		else
		{
			System.out.println("you are fresher");
		}
	}

}
