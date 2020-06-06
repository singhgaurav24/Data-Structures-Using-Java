
public class Kadanes_algorithm {
	static void findSum(int arr[])
	{
		int maxSum = arr[0];
		int sum = arr[0];
		  for(int i = 1;i<arr.length;i++)
		  {
			  sum  = Math.max(sum+arr[i] , arr[i]);
			  maxSum = Math.max(maxSum, sum);
		  }
		  System.out.println(maxSum);
   }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,-8,7,-1,2,3};
	       findSum(arr);
	}

}
