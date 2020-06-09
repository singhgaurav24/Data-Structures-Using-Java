
public class Peak_Element 
{
   static int peak(int arr[] , int low , int high , int n) {
//	   int mid = low +(high-low)/2;
//	   int low = 0;
//	   int high = arr.length-1;
	   int mid = low +(high-low)/2;
		   if(low>high)
			   return -1;
		   if((mid == 0 || arr[mid] >=  arr[mid-1]) && (mid == n-1 || arr[mid] >= arr[mid+1]))
				   return mid;
		   if(mid > 0 && arr[mid] < arr[mid-1])
		      return peak(arr, low , mid-1 , n);
		   else
			   return peak(arr, mid+1 , high ,n);
	   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[] = {5,10,20,15,7};
     int low =0 ;
	   int high = arr.length-1;
	   int n = arr.length;
	   System.out.println("Index of a peak point is  : "+peak(arr,low,high,n));
       // peak(arr,low,high,n);
	}

}
