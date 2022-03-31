package inheritance;

public class Animal1 { 
		void eat(){System.out.println("eating...");}  
		}  
		class Rabit extends Animal1{  
		void bark(){System.out.println("barking...");}  
		}  
		class Cat extends Animal1{  
		void meow(){System.out.println("meowing...");}  
		}  
		class TestInheritance3{  
		public static void main(String args[]){  
		Cat c=new Cat();  
		Rabit rabit=new Rabit();
		c.meow();  
		c.eat(); 
		rabit.bark();//C.T.Error  
		rabit.eat();
		}}  


