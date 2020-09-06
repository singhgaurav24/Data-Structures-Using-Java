
public class Spiral_Traversal {
	public static void spiral(int arr[][]) {
		for(int i = 0 ; i < arr.length ;i++) {
			System.out.print(arr[0][i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		spiral(arr);
	}

}
