package inheritance;

public class MultilevelInheritance {
	void eat(){System.out.println("eating...");}  
	}  
	class MultilevelInheritance1 extends MultilevelInheritance{  
	void bark(){System.out.println("barking...");}  
	}  
	class BabyDog extends MultilevelInheritance1{  
	void weep(){System.out.println("weeping...");}  
	}  
	class TestInheritance2{  
	public static void main(String args[]){  
	BabyDog d=new BabyDog();  
	d.weep();  
	d.bark();  
	d.eat();  
	}}  

