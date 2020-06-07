
public class Two_D_Array_Ex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[][] = {{1,2,3,4},{1,3,4,5},{1,5,5,6},{2,4,6,6}};
         
         for(int i =0;i<arr.length;i++)
         {
        	 for(int j = 0; j<arr.length;j++)
        	 {
        		 System.out.print(arr[i][j] + " ");
        	 }
        	 System.out.println();
         }
	}

}
