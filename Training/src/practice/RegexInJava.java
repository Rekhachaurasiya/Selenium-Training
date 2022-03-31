package practice;

import java.util.regex.Pattern;

public class RegexInJava {
	public static void main(String args[]){  
		System.out.println(Pattern.matches("[amn]*", "mmm"));  
		System.out.println(Pattern.matches("a{3,5}", "aaaaaa"));  
		System.out.println(Pattern.matches("[^amn]", "b"));
		System.out.println(Pattern.matches("[a-zA-Z]", "h"));
		System.out.println(Pattern.matches("[a-d[m-p]]", "z"));
		System.out.println(Pattern.matches("[a-z&&[def]]", "f"));
		System.out.println(Pattern.matches("[a-z&&[^bc]]", "d"));
		System.out.println(Pattern.matches("[a-z&&[^m-p]]", "q")); 
		System.out.println(Pattern.matches("[amn]", "m"));
				
		
			System.out.println("metacharacters d...."); 
			  
			System.out.println(Pattern.matches("\\d", "abv"));//false (non-digit)  
			System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
		    System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
		    System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
			  
			System.out.println("metacharacters D....");//D means non-digit  
			  
			System.out.println(Pattern.matches("\\D", "abs"));//false (non-digit but comes more than once)  
			System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
			System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
			System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
			System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  
			  
			System.out.println("metacharacters D with quantifier....");  
			System.out.println(Pattern.matches("\\D*", "mak"));//true (non-digit and may come 0 or more times)  
			  
			}
	}  
	
	

