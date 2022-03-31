package stringInJava;

public class JoinMethodInString {
	public static void main(String[] args) {         
	        String date = String.join("/","14","01","2022");    
	        System.out.print(date);  
	        String time = String.join(":", "12","10","10");  
	        System.out.println(" "+time);  
	        
	        String name=String.join("_","Bindu","Parvin","Rekha");
	        System.out.println(name);
	    }  
	
	}

