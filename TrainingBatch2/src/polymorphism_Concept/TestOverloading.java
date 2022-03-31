package polymorphism_Concept;

class Adder{
	 public int add(int a,int b) {
		return a+b;
	}
   public int add(int a,int b,int c) {
		return a+b+c;
	}
}

public class TestOverloading {
	public static void main(String[] args) {
//		System.out.println("adding 2 numbers :"+Adder.add(11, 11));
//		System.out.println("adding 3 numbers :"+Adder.add(2, 3, 5));
		Adder obj=new Adder();
		System.out.println(obj.add(11, 22));
		System.out.println(obj.add(2, 4, 6));
	}

}
