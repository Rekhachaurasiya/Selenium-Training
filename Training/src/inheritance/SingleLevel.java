package inheritance;

public class SingleLevel {
   int a=10;
	}
  class SingleLevel1 extends SingleLevel {
	int b=20;
	public static void main(String[] args) {
		SingleLevel obj=new SingleLevel();
		System.out.println(obj.a);
	}

}
