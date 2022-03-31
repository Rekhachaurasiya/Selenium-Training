package polymorphism_Concept;

class Animal{
	final String color="white";	
}
class Cat extends Animal{
	String color="Black";
	public void printColor() {
		System.out.println(color);//black
		System.out.println(this.color);//black
		System.out.println(super.color);//white
	}
}
public class TestSuper {
	public static void main(String[] args) {
		Cat c=new Cat();
		c.printColor();
	}

}
