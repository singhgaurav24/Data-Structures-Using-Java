import java.util.ArrayList;

public class Boundary_Traversa {
	/*
   public static void bTraversal(int arr[][] , int m , int n) {
	  if(m == 0) {
		  for(int i = 0 ; i < m ;i++)
		  System.out.print(arr[0][i]);
	  }
	  else  if(m == 0) {
		  for(int i = 0 ; i < m ;i++) {
		     System.out.print(arr[0][i]);
		  }
	  }
	  else {
		  for(int i = 0 ; i < n ;i++) {
			     System.out.print(arr[0][i]+" ");
			  }
		  for(int i = 1 ; i < m ;i++) {
			     System.out.print(arr[i][n-1]+" ");
			  }
		  for(int i = n-2 ; i >=0 ;i--) {
			     System.out.print(arr[m-1][i]+" ");
			  }
		  for(int i = m - 2 ; i >= 1 ;i--) {
			     System.out.print(arr[i][0]+" ");
			  }
	  }
   }
   */
	public  static ArrayList<Integer> boundaryTraversal(int arr[][], int m, int n)
	    {
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        if(m == 1) {
			  for(int i = 0 ; i < n ;i++)
			    list.add(arr[0][i]);
		  }
		  else  if(n == 1) {
			  for(int i = 0 ; i < m ;i++) {
			     list.add(arr[i][0]);
			  }
		  }
		  else {
			  for(int i = 0 ; i < n ;i++) {
				     list.add(arr[0][i]);
				  }
			  for(int i = 1 ; i < m ;i++) {
				     list.add(arr[i][n-1]);
				  }
			  for(int i = n-2 ; i >=0 ;i--) {
				     list.add(arr[m-1][i]);
				  }
			  for(int i = m - 2 ; i >= 1 ;i--) {
				    list.add(arr[i][0]);
				  }
		  }
		  return list;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int arr[][] = {{5,17}};
		System.out.println(boundaryTraversal(arr,1,2));
	}

}
