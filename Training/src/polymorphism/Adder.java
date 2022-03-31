package polymorphism;

public class Adder { 
		static int add(int a,int b)
		{return a+b;}  
		
		static double add(double a,double b)
		{return a+b;}  
		}  
		class TestOverloading1{  
		public static void main(String[] args){ 
//			Adder obj=new Adder();
//			System.out.println(obj.add(11,11));
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(10,10));  
		}}  


