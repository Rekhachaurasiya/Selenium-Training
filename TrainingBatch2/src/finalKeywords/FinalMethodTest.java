package finalKeywords;

 class A{
	int a=10;
	 void teach() {
		System.out.println("teaching");
	}
}
class B extends A{
	 void teach() {
		System.out.println("reading");
	}
}

public class FinalMethodTest {
	public static void main(String[] args) {
		B obj=new B();
		obj.teach();
	}

}
