package constructorInJava;

public class StaticmethodJava {
	
	     int rollno;
	     String name;
	     static String college = "ITS";
	     
	     static void change(){
	     college = "BBDIT";
	     }

	     StaticmethodJava(int r, String n){
	     rollno = r;
	     name = n;
	     System.out.println(rollno+ " " +name+ " " +college);
	     }

	   
	    public static void main(String args[]){
	    	StaticmethodJava.change();
	    	StaticmethodJava s1 = new StaticmethodJava(111,"Karan");
	    	StaticmethodJava s2 = new StaticmethodJava(222,"Parvin");
	    	
	    }
	}	
