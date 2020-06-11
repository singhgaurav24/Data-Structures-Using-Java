
public class Maximum_Circular_SubArray {
   static void solution(int arr[]){
	   int n = arr.length;
	   int maxSum = arr[0];
	   for(int i = 0 ; i<arr.length; i++)
	   {
		      int curr_max = arr[i];
		      int curr_sum = arr[i];
		      for(int j = 1;j<arr.length;j++)
		      {
		    	  int index = (i+j)%n;
		    	  curr_sum += arr[index];
		    	  curr_max = Math.max(curr_sum, curr_max);
		      }
		      maxSum = Math.max(curr_max, maxSum);
	   }
	   
	   	System.out.println("Maximum sum of circular sub array is : "+maxSum);
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {5,-2,3,4};
      solution(arr);
	}

}
