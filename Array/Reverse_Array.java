
public class Reverse_Array {
    static void reverse(int arr[])
    {
    	int n = arr.length;
    	int low = 0 ; 
    	int high = n-1;
    	int temp;
    	while(low<high)
    	{
    		temp  =  arr[low];
    		arr[low] = arr[high];
    		arr[high] = temp;
    		low++;
    		high--;
    	}
    	
    	for(int i = 0 ;i<arr.length;i++)
    	{
    	    System.out.print( arr[i]+" ");	
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  System.out.print("Actual array              : "+" ");
      int arr[] = {1,4,3,55,45,55,7,9,2};
      for(int i = 0 ;i<arr.length;i++)
  	 {
  	    System.out.print( arr[i]+" ");	
  	 }
      System.out.println();
      System.out.print("After Reversing the array : "+" ");
      reverse(arr);
	}

}
