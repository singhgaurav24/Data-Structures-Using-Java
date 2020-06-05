
public class Remove_Duplicate {
    static void remove(int arr[])
    {
    	int n = arr.length;
    	int temp[]  = new int[n];
    	temp[0] = arr[0];
    	int res = 1;
    	System.out.println("length of original array is  :" + "  " +n);
    	for(int i = 1 ; i < n ;i++)
    	{
    	    if(temp[res-1] != arr[i])
    	    {
    	    	temp[res] = arr[i];
    	    	res++;
    	    }
    	}
    	System.out.println("length of final array is  :" + "  " +res);
        for(int i = 0 ; i <res;i++)
        {
        	arr[i] = temp[i];
        	System.out.print(arr[i] +" ");
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[] = {1,5,5,7,7,7,8,9,9};
     remove(arr);
	}

}
