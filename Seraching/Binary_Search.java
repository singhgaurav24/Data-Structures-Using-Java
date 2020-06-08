
public class Binary_Search {
	
    static void search(int arr[] , int item)
    {
    	int li = 0;
    	int hi = arr.length-1;
    	int mid = (li+hi)/2;
    	while(li<=hi)
    	{
    		if(arr[mid]==item)
    		{
    			System.out.println("Item is found at index  : " +mid);
    			break;
    			
    		}
    		else if(arr[mid] < item)
    		{
    			li = mid+1;
    		}
    		else
    		{
    			hi  = mid -1;
    		}
    		mid = (li+hi)/2;
    	}
    	if(li>hi)
    	{
    		System.out.println("Item does not exist");
    	}
    		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {2,4,5,6,7,8,9,10,14,112,223,2224};
        search(arr,100);
	}

}
