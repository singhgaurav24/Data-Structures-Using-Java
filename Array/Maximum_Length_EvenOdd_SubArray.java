
public class Maximum_Length_EvenOdd_SubArray {
   static void maxLength(int arr[])
   {
	   int max = 1 ; 
	   for(int i = 0;i<arr.length;i++)
	   {
		   int curr = 1;
		 for(int j=i+1;j<arr.length;j++)
		 {
			 if(arr[j]%2==0 && arr[j-1]%2!=0 ||arr[j]%2!=0 && arr[j-1]%2==0)
			 {
				 curr++;
				 
			 }
			 else
			 {
				 break;
			 }
		 }
		 max = Math.max(max, curr);
	   }
	   System.out.println(max);
   }
   
   
   static void maxLength1(int arr[])
   {
	   int max = 1 ;
	   int curr = 1;
	   for(int i = 1;i<arr.length;i++)
	   {
		   
		   if(arr[i]%2==0 && arr[i-1]%2!=0 || arr[i]%2!=0 && arr[i-1]%2==0)
			 {
				 curr++;	
				 max = Math.max(max, curr);
			 }
		   
	   }
	   System.out.println(max);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[] = {10,12,14,7,8};
         System.out.print("this is order of n^2 solution:   ");
         maxLength(arr);
         System.out.print("this is order of n solution  :   ");
         maxLength1(arr);
	}

}
