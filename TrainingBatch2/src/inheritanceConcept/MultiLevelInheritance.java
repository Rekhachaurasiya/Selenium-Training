package inheritanceConcept;


class A {
	void a() {
		System.out.println("this is class A");
	}
}
class B extends A{
	void b() {
		System.out.println("this is class B");
	}
}
class C extends B{
	void c() {
		System.out.println("this is class C");
	}
	
}
public class MultiLevelInheritance {
	
	public static void main(String[] args) {
		C obj=new C();
		obj.a();
		obj.b();
		obj.c();	
	}

}

