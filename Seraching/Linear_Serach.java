
public class Linear_Serach {
    static void search(int arr[] , int item)
    {
    	int temp = 0;
    	for(int i = 0;i<arr.length;i++)
    	{
    		if(arr[i] == item)
    		{
    			System.out.println("Item found at index"+"  :  "+i);
    			temp += 1;
    		}
    		
    	}
    	if(temp == 0)
    	{
    		System.out.println("Item does not found");
    	}
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int arr[]  = {2,4,2,6,25,75,23,2};
           int item = 75;
           search(arr,item);
	}

}
