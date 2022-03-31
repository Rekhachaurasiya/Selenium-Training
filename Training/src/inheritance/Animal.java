package inheritance;

public class Animal {
	
		void eat(){System.out.println("eating...");}  
		}  

		class Dog extends Animal{  
		void bark(){System.out.println("barking...");}  
		}  
		
		class TestInheritance{  
		public static void main(String args[]){  
		Dog dog=new Dog();  
		dog.bark();  
		dog.eat();  
		}
		}  


