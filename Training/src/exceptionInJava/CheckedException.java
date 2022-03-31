package exceptionInJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
	public static void main(String[] args) throws FileNotFoundException {
		
		
			FileInputStream fis=new FileInputStream("C:\\Users\\0014HO744\\Desktop\\IO\\abc.txt");
		
	
		System.out.println("Hello");
	}
}
