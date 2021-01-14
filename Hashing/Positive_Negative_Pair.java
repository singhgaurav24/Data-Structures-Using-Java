import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Positive_Negative_Pair {
	public static ArrayList<Integer>findPairs(int arr[], int n) 
    { 
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	HashSet<Integer> hs = new HashSet<Integer>();
    	
    	for(int i = 0 ; i < n ; i++) {
    		if(hs.contains(-arr[i])) {
    			int num = Math.abs(arr[i]);
    			list.add(-num);
    			list.add(num);
    		}
    		hs.add(arr[i]);
    	}
    	return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[] = {1,3,6,-2,-1,-3,2,7};
         int n = arr.length;
         System.out.println(findPairs(arr,n));
	}

}
