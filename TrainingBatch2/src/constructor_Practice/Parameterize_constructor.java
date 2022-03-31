package constructor_Practice;

public class Parameterize_constructor implements Cloneable {
	   int empid;  
	    String name;
	    String company;
	    
	    Parameterize_constructor(int id,String name,String company){  
	    	empid = id;  
	         name = name; 
	         company=company;
	         System.out.println(empid+" "+name+" "+company);
	    }  
	    public Object clone() throws CloneNotSupportedException  {
	    	return super.clone();
	    }
	      
	    public static void main(String args[]){ 
	    	try {
	    	Parameterize_constructor pc=new Parameterize_constructor(12,"Swati","Accenture");
				Parameterize_constructor pc1=(Parameterize_constructor)pc.clone();
				System.out.println(pc.empid+" "+pc.name+ " "+pc.company);
				System.out.println(pc.empid+" "+pc.name+" "+pc.company);
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
	    	//Parameterize_constructor pc1=new Parameterize_constructor(13,"Rekha","IBM");
	    	
	   
	    
	   }  

}
