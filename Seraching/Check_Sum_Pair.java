
public class Check_Sum_Pair {
   static boolean checkSum(int arr[] ,int low , int high,int sum)
   {
	   while(low<=high)
	   {
	   if(arr[low]+arr[high] == sum)
		   return true;
	   
	   if(arr[low]+arr[high] > sum)
	       high--;
	   
	   else 
		   low++;
	   
	   
	   }
	   
	   return false;
	   
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[] = {2,5,8,12,30};
     int sum  = 17;
     int low = 0 ;
	 int n = arr.length;
	 int high = n-1;
	 System.out.println(arr[low]+","+arr[high]);
     System.out.println(checkSum(arr,low,high,sum));
     
	}

}
