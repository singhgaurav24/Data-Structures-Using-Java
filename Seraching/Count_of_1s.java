
public class Count_of_1s {
    static int count(int arr[] , int low , int high,int n)
    {
    	int mid = low+(high-low)/2;
    	if(low>high)
    		
       	 return -1;
       	
       	if((arr[mid] == 1) && (mid == 0 || arr[mid+1] != 1))
           		
        	       return mid;
        		
       	if(arr[mid] > 1)
           
       	return count(arr , low , mid-1, n);
       
       else
       
       	return count(arr , mid+1 , high, n);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {0, 0, 0, 0, 1, 1, 1, 1, 1};
	        int n = arr.length;
	     System.out.println(count(arr,0,arr.length-1, n));
	}

}
