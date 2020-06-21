import java.util.*;
public class Count_Distinct_Element {
   public static void count(int arr[])
   {
	   HashSet<Integer> h = new HashSet<Integer>();
	   for(int i =0;i<arr.length;i++)
	   {
		   h.add(arr[i]);
	   }
	   System.out.println(h.size());
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int arr[] = {1,2,5,2,4,1,5,8,5,3,1};
    count(arr);
	}

}
