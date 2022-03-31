package encapsulationTest;

public class EnacapTest {
	private String name="Avika";
	private int empID;
	private int age;
	
	public String getName() {
		return name;
	}
	public int getempID() {
		return empID;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String newname) {
		name=newname;
	}
	
	public void setEmpId(int newID) {
		empID=newID;
	}
	public void setAge(int newAge) {
		age=newAge;
	}
}
 class RunEnacp1 {
	public static void main(String[] args) {
		EnacapTest ecap=new EnacapTest();
		ecap.setName("Avika");
		ecap.setEmpId(1234);
		ecap.setAge(25);
		System.out.println("Name :"+ecap.getName());
		System.out.println("EmpID :"+ecap.getempID());
		System.out.println("Age :"+ecap.getAge());
		
	}

}


