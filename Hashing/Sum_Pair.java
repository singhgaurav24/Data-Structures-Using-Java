import java.util.*;
public class Sum_Pair {
 public static boolean findSum(int a[] , int sum)
 {
	 HashSet<Integer> h = new HashSet<Integer>();
	 for(int i = 0; i<a.length;i++)
	 {
		 if(h.contains(sum-a[i]))
			 return true;
		 
		 h.add(a[i]);
		 
	 }
	 return false;
	 //System.out.println(h);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int a[] = {2,5,7,1,9,6};
       int sum = 8;
       System.out.println(findSum(a,sum));
       
	}

}
