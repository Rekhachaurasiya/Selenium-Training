package constructorInJava;

public class NestedClass { 
		  static int data=30;  
		  
		  static class Inner{  
		   static void msg()
		   {
			   System.out.println("data is "+data);
			   }  
		  }  
		  public static void main(String args[]){  
			  NestedClass.Inner.msg();//no need to create the instance of static nested class  
		  }  
		}  


