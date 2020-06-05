
public class Left_Rotate_By_One {
     static void rotate(int arr[])
     {
    	 int n = arr.length;
    	 int temp = arr[0];
    	 
    	 for(int i = 1 ;i<arr.length;i++)
    	 {
    		 arr[i-1] = arr[i];
    		 arr[n-1] = temp;
    		
    	 }
    	 
    	 for(int i = 0 ; i <n;i++)
         {
         	
         	System.out.print(arr[i] +" ");
         }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {1,5,4,7,8,9,8,5};
       rotate(arr);
	}

}
