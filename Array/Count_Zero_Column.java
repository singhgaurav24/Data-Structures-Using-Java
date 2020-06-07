public class Count_Zero_Column {
       
	static void countZero(int arr[][], int n)
	{
		int colSum[] = new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
               colSum[j] += arr[i][j];
	        }
	     }
	    int max=0;
	    for(int i=1;i<n;i++)
	    {
	    	if(colSum[max] > colSum[i])
	    	{
	    		max=i;
	    		
	    	}
	    }
	  System.out.println(max);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[][] = {{1,1,0},{1,1,0},{1,1,0}};
         countZero(arr,3);
	}

}
