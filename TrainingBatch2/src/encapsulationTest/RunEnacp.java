package encapsulationTest;

public class RunEnacp {
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
