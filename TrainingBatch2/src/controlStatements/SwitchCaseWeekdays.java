package controlStatements;

import java.util.Scanner;

public class SwitchCaseWeekdays {
	public static void main(String[] args) {
		int weekdays;
		System.out.println("Enter weekdays number which you need :");
		Scanner sc=new Scanner(System.in);
		weekdays=sc.nextInt();
		switch(weekdays) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4 :
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Friday");
			break;
		case 6 :
			System.out.println("Saturday");
			break;
		case 7 :
			System.out.println("Sunday");
		   break;
		default :
			System.out.println("This is not weekdays or weeked");
	}

}
}
