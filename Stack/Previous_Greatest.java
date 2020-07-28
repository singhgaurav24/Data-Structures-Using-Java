package Stack;

public class Previous_Greatest {
public static void prev(int arr[] , int n) {
	for(int i = 0 ;i<arr.length ; i++) {
		System.out.print(arr[i] + " ");
		arr[i] = -1;	
	}
	   System.out.println();
	
	
	
	
	for(int i = 0 ;i<arr.length ; i++) {
		System.out.print(arr[i] +" ");
			
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr[] = {15,10,18,12,4,6,2,8};
  int n  = arr.length;
  prev(arr,n);
	}

}
