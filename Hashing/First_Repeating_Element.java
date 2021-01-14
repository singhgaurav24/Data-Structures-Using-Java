import java.util.HashSet;

public class First_Repeating_Element {
	public static int firstRepeated(int []arr, int n) 
	{
	    //Your code here
	    int min  = -1;
	    HashSet<Integer> h = new HashSet<Integer>();
	    for(int i = n-1 ; i >= 0 ; i--){
	        if(h.contains(arr[i])){
	            min =  i;
	        }
	        else
	            h.add(arr[i]);
	        
	    }
	    if(min == -1){
	        return -1;
	    }
	    return min+1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {1, 5, 3, 4, 3, 5, 6};
       int n = arr.length;
       System.out.println(firstRepeated(arr,n));
	}

}
