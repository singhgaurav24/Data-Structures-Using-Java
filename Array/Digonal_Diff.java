
public class Digonal_Diff {
     static void dig_Diff(int arr[][])
     {
    	// int diff = 0;
    	 int sum1 = 0;
    	 int sum2 = 0;
    	 int i,j,k,m;
    	 int n = arr.length;
    	 for(i = 0 ; i<n ; i++)
    	 {
    		 for(j = 0 ; j<n ; j++)
    		 {
    			if(i==j)
    			{
    				sum1 = sum1 + arr[i][j];
    			}
    			if((i+j) == n-1)
    			{
    				sum2 = sum2 + arr[i][j];
    			}
    		 }
    	 }
    	 int diff = Math.abs(sum1-sum2);
    	 System.out.println("Length of diagonal     :"+" "+ n);
    	 System.out.println("Sum of first diagonal  :"+" "+sum1);
    	 System.out.println("Sum of second diagonal :"+" "+sum2);
    	 System.out.println("Difference is          :"+" "+diff);
    	 //return sum2;
    	// return Math.abs(diff);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[][] = {{1,2,3},{4,5,6},{9,8,9}};
       
       dig_Diff(arr);
	}

}
