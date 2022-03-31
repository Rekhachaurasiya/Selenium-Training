package controlStatements;

import java.util.Scanner;

public class SwitchCaseStatement {
	public static void main(String[] args) {
		String months;
		System.out.println("Enter the month :");
		Scanner scanner=new Scanner(System.in);
		months=scanner.next();
		
		switch(months) {
		case "January":
			System.out.println("1st month");
			break;
		case "February":
			System.out.println("2nd month");
			break;
		case "March":
			System.out.println("3rd month");
			break;
		case "April":
			System.out.println("4th month");
			break;
		case "May":
			System.out.println("5th month");
			break;
		case "June":
			System.out.println("6th month");
			break;
		case "July":
			System.out.println("7th month");
			break;
		case "August":
			System.out.println("8th month");
			break;
		case "September":
			System.out.println("9th month");
			break;
		case "October":
			System.out.println("10th month");
			break;
		case "November":
			System.out.println("11th month");
			break;
		case "December":
			System.out.println("12th month");
			break;
			default:
				System.out.println("This is not a valid month");
		}
	}

}
