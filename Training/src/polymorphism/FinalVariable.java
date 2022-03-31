package polymorphism;

public class FinalVariable {
	 int speedlimit=90;
	 void run(){  
	  speedlimit=400;
	  System.out.println(speedlimit);
	 }  
	 public static void main(String args[]){  
		 FinalVariable obj=new  FinalVariable();  
	 obj.run();  
		 
	 }  

}
