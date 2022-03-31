package constructorInJava;

public class Thiskeyword {  
		int rollno;  
		String name;  
		float fee;  
		Thiskeyword(int rollno,String name,float fee){  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee; 
		System.out.println(rollno+" "+name+" "+fee);
		} 
		
//		void display(){
//			System.out.println(rollno+" "+name+" "+fee);
//			}  
		 
		  
		 
		public static void main(String args[]){  
			Thiskeyword s1=new Thiskeyword(111,"Parvin",5000f);  
			Thiskeyword s2=new Thiskeyword(112,"sumit",6000f);  
//		s1.display();  
//		s2.display();  
		}}  

		