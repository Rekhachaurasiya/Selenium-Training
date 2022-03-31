package polymorphism_Concept;

class Adder3{
	void add(int a, int b) {
		System.out.println(a+b);
	}
}
class Adder2 extends Adder3 {
	void add(int c, int d) {
		System.out.println(c+d);
	}
}
public class TestOverriding2 {
	public static void main(String[] args) {
		Adder2 obj=new Adder2();
		obj.add(3, 5);
	}

}
