package Stack;
import java.util.*;
public class Prev_Greatest_Stack_Soln {
public static void prev(int arr[] ,int n) {
	Stack<Integer> st = new Stack<Integer>();
	st.push(arr[0]);
	System.out.print("-1"+" ");
	
	for(int i = 1 ; i < n ;i++) {
		while(st.empty() == false && st.peek() < arr[i]) 
			st.pop();
			if(st.empty() == true) {
				System.out.print("-1"+" ");
			}
			else {
				System.out.print(st.peek()+" ");
			}
			st.push(arr[i]);
		}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {15,10,18,12,4,6,2,8};
		  int n  = arr.length;
		  prev(arr,n);
	}

}
