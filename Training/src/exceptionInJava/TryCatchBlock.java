package exceptionInJava;

public class TryCatchBlock {
	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		int a=50,b=0,c;
		try {
		c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
	    e.printStackTrace();   //it is better to use
	    //System.out.println(e);
			//System.out.println(e.getMessage());
	      //System.out.println(e.toString());
	    }
		
	}
}
