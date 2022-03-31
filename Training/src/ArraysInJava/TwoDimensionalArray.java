package ArraysInJava;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] arr=new int[3][3]; 
		arr[0][0]=5;
		arr[1][0]=7;
		arr[0][1]=9;
		arr[0][2]=11;
		arr[1][1]=12;
		arr[1][2]=13;
		arr[2][0]=14;
		arr[2][1]=15;
		arr[2][2]=16;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
			System.out.print(arr[i][j]+ " ");
		}
			System.out.println();
	}

}
}
