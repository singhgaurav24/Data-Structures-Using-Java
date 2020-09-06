
public class Rotate_By_90 {
	public static void rotate(int arr[][] ,int m ,int n) {
		int temp[][] = new int[m][n];
		for(int i = 0 ; i < arr.length ;i++) {
			for(int j = 0 ; j<arr.length ; j++) {
				temp[arr.length-j-1][i] = arr[i][j];
			}
			
		}
		
		for(int i = 0 ; i < arr.length ;i++) {
			for(int j = 0 ; j<arr.length ; j++) {
				arr[i][j] = temp[i][j];
			}
			
		}
		
		for(int i = 0 ; i < arr.length ;i++) {
			for(int j = 0 ; j<arr.length ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr,3,3);
	}

}
