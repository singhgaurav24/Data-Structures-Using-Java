import java.util.*;
public class Union_Of_Two_UnSorted_Array {
public static void union(int a[],int b[])
{
	int res = 0;
   HashSet<Integer> h = new HashSet<Integer>();
   int m = a.length;
   int n = b.length;
   int c[] = new int[m+n];
   for(int i = 0 ; i<a.length;i++)
   {
	   c[i] = a[i];
   }
   for(int i = 0 ; i<b.length;i++)
   {
	   c[m+i] = b[i];
   }
   for(int i = 0 ; i<c.length;i++)
   {
	  // System.out.print(c[i]+" ");
	   h.add(c[i]);
   }
   System.out.println(h.size());
   
   
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = {1,2};
		 int b[] = {1,2,3};
		 union(a,b);
	}

}
