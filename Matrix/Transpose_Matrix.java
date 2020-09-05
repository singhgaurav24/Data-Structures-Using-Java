
public class Transpose_Matrix {
	public static void findTranpose(int arr[][] , int n , int m) {
		int temp[][] = new int[m][n];
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ;j++) {
			   temp[i][j] = arr[j][i];
			}	
		}
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ;j++) {
			   arr[i][j] = temp[i][j];
			}	
		}
		for(int i = 0 ; i < arr.length ; i++) {
			for(int j = 0 ; j < arr[i].length ;j++) {
			  System.out.print(arr[i][j]+" ");
			}	
			System.out.println();
		}
		
		
		
		   
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		findTranpose(arr,4,4);
	}

}
