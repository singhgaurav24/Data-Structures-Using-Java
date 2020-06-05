
public class Maximum_Difference_problem {
    static void max(int arr[] , int size)
    {
    	int maxdiff  = 0;
    	int max1 = 0;
    	for(int i = 0 ; i < size ; i++)
    	{
    		for(int j = i+1 ; j < size ; j++)
    		{
    			if(arr[j] > arr[i])
    			{
    				maxdiff = (arr[j] - arr[i]);
    				
    				if(max1 < maxdiff)
    				{
    					max1 = maxdiff;
    				}
    				//return;
    			}
    		}
    	}
    	System.out.println(max1);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[] = {7,9,5,6,3,2};
	
    int n = arr.length;
    max(arr,n);
	}

}
