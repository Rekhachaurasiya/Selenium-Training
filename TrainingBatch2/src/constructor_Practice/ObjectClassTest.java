package constructor_Practice;

public class ObjectClassTest implements Cloneable{
	int empID;
	String name;
	
	ObjectClassTest(int id,String n){
		empID=id;
		name=n;
	}
	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		ObjectClassTest obj=new ObjectClassTest(11,"Avika");
		ObjectClassTest obj1=(ObjectClassTest)obj.clone();
		ObjectClassTest obj2=(ObjectClassTest)obj.clone();
		System.out.println(obj.empID+" "+obj.name);
		System.out.println(obj1.empID+" "+obj1.name);
		System.out.println(obj2.empID+" "+obj2.name);
		
	}

}
