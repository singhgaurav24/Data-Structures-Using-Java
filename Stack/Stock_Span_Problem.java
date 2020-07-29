package Stack;

public class Stock_Span_Problem {
  static void findSpan(int arr[] , int n) {
	  int span[] = new int[n] ;
	  for(int i = 0 ; i < span.length ;i++) {
		  span[i] = 1;
		  System.out.print(span[i] +" ");
	  }
	  
	  for(int i = 1 ; i < n ;i++) {
		  for(int j = i-1 ;j >= 0 ;j--) {
			  if(arr[j] <= arr[i]) {
				  span[i]++;
			  }
			  else {
				  break;
			  }
		  }
	  }
	  System.out.println();
	  for(int i = 0 ; i < span.length ;i++) {
		  System.out.print(span[i] +" ");
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {15,13,12,14,16,8,6,4,10,30};
       int n = arr.length;
       findSpan(arr,n);
	}

}
