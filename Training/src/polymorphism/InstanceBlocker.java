package polymorphism;

public class InstanceBlocker { 
	    int speed;  
	      
	    {System.out.println("speed is "+speed);}  
	   
	    {speed=100;}  
	       
	    public static void main(String args[]){  
	    	InstanceBlocker b1=new InstanceBlocker();  
	    	InstanceBlocker b2=new InstanceBlocker();  
	    }      
	}  


