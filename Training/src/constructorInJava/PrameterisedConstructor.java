package constructorInJava;

public class PrameterisedConstructor {
	    int id;  
	    String name;  
	    
	    //creating a parameterized constructor  
	 PrameterisedConstructor(int id,String name){  
	    id = id;  
	    name = name;  
	    System.out.println(id+" "+name);
	    }  
	      
	   
	    public static void main(String args[]){  
	    //creating objects and passing values  
	    	PrameterisedConstructor s1 = new PrameterisedConstructor(1,"Parvin");  
	    	PrameterisedConstructor s2 = new PrameterisedConstructor(2,"Bindu");  
	     
	    
	   }  
	}  


