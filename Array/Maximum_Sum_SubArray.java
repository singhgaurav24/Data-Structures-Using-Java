
public class Maximum_Sum_SubArray {
    static void findSum(int arr[])
    {
    	int maxSum = arr[0];
    	for(int i = 0 ;i<arr.length;i++) {
    		int currSum = 0;
    		for(int j=i;j<arr.length;j++)
    		{
                 currSum += arr[j];
                 maxSum = Math.max(currSum, maxSum);
    		}
    	}
    	System.out.println(maxSum);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {2,3,-8,7,-1,2,3};
       findSum(arr);
	}

}
