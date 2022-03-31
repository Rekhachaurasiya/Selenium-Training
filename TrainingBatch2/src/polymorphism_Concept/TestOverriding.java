package polymorphism_Concept;

class Human{
	  void speak() {
		System.out.println("speaking");
	}
}
class Avika extends Human{
	 void speak() {
		System.out.println("talking with team");
	}
}
public class TestOverriding {
	public static void main(String[] args) {
		Avika obj=new Avika();
		obj.speak();
	}

}
