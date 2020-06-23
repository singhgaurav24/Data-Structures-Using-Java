import java.util.*;
public class Check_Equal_Array {
public static void isEqual(int a[] , int b[])
{
	HashSet<Integer> h1 = new HashSet<Integer>();
	HashSet<Integer> h2 = new HashSet<Integer>();
	for(int i = 0;i<a.length;i++)
	{
		h1.add(a[i]);
	}
	for(int j = 0;j<b.length;j++)
	{
		h2.add(b[j]);
	}
	if(h1.contains(h2))
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[] = {1,2,7,5,4};
    int b[] = {1,2,7,5,4};
    isEqual(a,b);
	}

}
