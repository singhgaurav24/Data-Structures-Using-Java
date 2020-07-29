package Stack;
import java.util.*;
public class Next_Greatest {
	public static void solution(int arr[] , int n) {
		/*
		for(int  i = 0 ;i <n ;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		int j;
		for(int i = 0 ; i < n ; i++) {
			for(j = i+1 ; j<n ; j++) {
			   if(arr[j] > arr [i]) {
				  System.out.print(arr[j]+" ");
				   break;
			   }

			}
			if(j == n) {
				System.out.print("-1 ");
			}
		}
		*/
		Stack<Integer> st = new Stack<Integer>();
		st.add(arr[n-1]);
		
		for(int i = n-2 ; i >= 0 ; i--) {
			while(st.empty() == false && st.peek() <= arr[i]) 
				st.pop();
				if(st.empty() == true) {
					System.out.print("-1"+" ");
				}
				else {
					System.out.print(st.peek()+" ");
				}
				st.push(arr[i]);
			
		}
		System.out.print("-1");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int arr[] = {25,20,15,10};
		int n = arr.length;
		solution(arr,n);
	}

}
