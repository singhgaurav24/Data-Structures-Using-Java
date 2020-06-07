
public class Example_02 {
      
	static void find(int arr[] , int arr_size)
	{
		/*
		int res = arr[0];
		for(int i =1;i<arr.length;i++)
			res = res^arr[i];
			return res;
		*/
		int res = arr[0];
		for(int i = 0; i<arr_size;i++)
		{
			for (int j =1; j<arr_size;j++)
			{
		          if(arr[i] != arr[j])
		          {
		        	  System.out.print(res);
		          }
			}
		}
		//return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[] = {2,3,3,4,5,5,4};
           find(arr,7);
           
           //System.out.println(find(arr,7));
	}

}
