
public class Maximum_Circular_Subarray_O_n {
	static int findSum(int arr[])
	{
		int maxSum = arr[0];
		int sum = arr[0];
		  for(int i = 1;i<arr.length;i++)
		  {
			  sum  = Math.max(sum+arr[i] , arr[i]);
			  maxSum = Math.max(maxSum, sum);
		  }
		  return maxSum;
   }
static int subarray(int arr[] , int n)
{
	int max_normal = findSum(arr);
	if(max_normal < 0)
		return max_normal;
	
	int arr_sum =0;
	for(int i=0;i<n;i++)
	{
		arr_sum += arr[i];
		arr[i] =  -arr[i];
		
	}
	int max_circular = arr_sum + findSum(arr);
	
	return Math.max(max_normal, max_circular);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,-2,3,4};
		int n = arr.length;
		System.out.println(subarray(arr,n));
	      
	}

}
