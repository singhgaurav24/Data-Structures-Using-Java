import java.util.*;
public class Count_Frequency_Of_Element {
	public static void freq(int arr[])
    {
   	    LinkedHashMap<Integer , Integer> hmp = new LinkedHashMap<Integer,Integer>();
    	for(int i = 0; i < arr.length; i++)
        {
        int key = arr[i];
        if(hmp.containsKey(arr[i]) == true)
          hmp.put(arr[i], hmp.get(arr[i]) + 1);
        else
          hmp.put(arr[i], 1);    
        }
    	for(Map.Entry<Integer, Integer> itr: hmp.entrySet())
            System.out.println(itr.getKey() + " " + itr.getValue());
    }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,5,1,5,1,4,8,1,82,79,1,2,2,2,31,1};
		 freq(arr);
	}
   
}
