package exceptionInJava;

import java.util.Scanner;

public class ThrowKeyword {
	public static void validate(int age) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enetr you age :");
//		int age=sc.nextInt();
        if(age<18) {  
          
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    
    public static void main(String args[]){  
    	//ThrowKeyword val=new ThrowKeyword();  
    	validate(18);  
        System.out.println("rest of the code...");    
  }    
}    


