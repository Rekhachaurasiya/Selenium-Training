package variables;

public class This_Keyword {
	int rollNo;
	String name;
	float fee;
	This_Keyword(int rollNo,String name,float fee){
		this.rollNo=rollNo;
		this.name=name;
		this.fee=fee;
		System.out.println(rollNo+" "+name+" "+fee);
	}
	public static void main(String[] args) {
		This_Keyword obj=new This_Keyword(123,"Avika",50000f);

}
}
