
public class Count_Occurrences {
    static int left(int arr[] ,int low,int high, int x,int n)
    {
//    	int low = 0; 
//    	int high = arr.length-1;
    	int mid = low+(high-low)/2;
    	//int n = arr.length;
    	if(low>high)
    		
    	 return -1;
    	
    	if((arr[mid] == x) && (mid == n-1 || arr[mid+1] != x))
        		
     	       return mid;
     		
    	if(arr[mid] > x)
        
    	return left(arr , low , mid-1 , x, n);
    
    else
    
    	return left(arr , mid+1 , high , x, n);
         
     	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[] = {2,3,3,3,3,4,7};
    
    System.out.println(left(arr,0,arr.length-1,3,arr.length));
	}

}
