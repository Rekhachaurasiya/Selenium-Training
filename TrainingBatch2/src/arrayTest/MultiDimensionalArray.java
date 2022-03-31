package arrayTest;

public class MultiDimensionalArray {
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		arr[0][0]=6;
		arr[0][1]=18;
		arr[0][2]=19;
		arr[1][0]=7;
		arr[1][1]=15;
		arr[1][2]=30;
		arr[2][0]=77;
		arr[2][1]=55;
		arr[2][2]=33;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
