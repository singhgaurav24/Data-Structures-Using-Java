import java.util.*;
public class Intersection_Of_Two_Array {
public static void inter(int a[] , int b[] ,int m ,int n)
{
	Set<Integer> hs = new HashSet<Integer>();
    for(int i = 0; i < m; i++)
      hs.add(a[i]);
    int res = 0;
    for(int i = 0; i < n; i++)
    {
        if(hs.contains(b[i]))
        {
            res++;
            hs.remove(b[i]);
        }
    }
    System.out.println(res);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 int a[] = {1,2};
		 int b[] = {1,2,2};   
		 int m = a.length;
		 int n = b.length;
         inter(a,b,m,n);
	}

}
