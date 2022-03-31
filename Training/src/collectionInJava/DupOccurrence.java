package collectionInJava;

public class DupOccurrence {
	public static void main(String[] args) {
		int count = 0;
		  String str="chaurasiyya";
		  char[] c=str.toCharArray();
		 // System.out.println("Duplicate characters are:");
		  for(int i=0;i<c.length-1;i++)
		  {
		   for(int j=i+1;j<c.length-1;j++)
		   {
		    if(c[i]==c[j])
		    {
		     System.out.println(c[j]);   
			count++;
		     break;
		    }
		   }
		  }
		 }

}
