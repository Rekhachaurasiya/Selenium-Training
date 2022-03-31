package inheritanceConcept;

class Parent{
	void eat() {
		System.out.println("eating");
	}
}
class Rekha extends Parent{
	void speak()
	{
		System.out.println("speaking");
	}
}
class Roshan extends Parent{
	void run() {
		System.out.println("running");
	}
}

public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		Roshan obj=new Roshan();
		obj.run();
		obj.eat();
		Rekha obj1=new Rekha();
		obj1.speak();
		obj1.eat();
	}

}
