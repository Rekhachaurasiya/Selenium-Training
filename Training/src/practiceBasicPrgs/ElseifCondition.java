package practiceBasicPrgs;

import java.util.Scanner;

public class ElseifCondition {
	public static void main(String[] args) {
		int age;
		System.out.println("Enter your age : ");
		Scanner scanner=new Scanner(System.in);
		age=scanner.nextInt();
		if(age>50) {
			System.out.println("you are experienced");
		}
		else if(age>40) {
			System.out.println("you are semi-exprienced!");
		}
		else if(age>30) {
			System.out.println("you are junior!");
		}
		else {
			System.out.println("you are fresher!");
		}
	}

}
