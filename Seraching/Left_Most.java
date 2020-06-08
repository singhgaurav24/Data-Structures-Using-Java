
public class Left_Most {
   public  static int left(int arr[] ,int low ,int high , int x )
    {
//	    low = 0;
//	    high = arr.length-1;
	   int mid = low+(high-low)/2;
    	if(low>high)
    	{
    		return -1;
    	}
    	if((arr[mid] == x) && (mid == 0 || arr[mid-1] != x))
    		
    	       return mid;
    		
        if(arr[mid] >= x)
        
        	return left(arr , low , mid-1 , x);
        
        else
        
        	return left(arr , mid+1 , high , x);
        
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {10,20,30,30,30,30,30,50,70};
      //left(arr,0,arr.length-1,30);
      int low = 0;
      int high = arr.length-1;
      System.out.println(left(arr,low,high,30));
	}

}
