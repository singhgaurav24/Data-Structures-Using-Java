package Stack;

public class Previous_Greatest {
public static void prev(int arr[] , int n) {
	int prev[] = new int[n];
	prev[0] = -1;
	for(int i = 0 ;i<arr.length ; i++) {
		System.out.print(arr[i] +" ");
	}
	System.out.println();
	for(int i = 0; i<prev.length ; i++) {
		for(int j = i-1 ; j>= 0 ;j--) {
			if(arr[j] > arr[i]) {
				prev[i] = arr[j];
				break;
			}
			else {
					prev[i] = -1;
				}
			}
		}
	for(int i = 0 ;i<arr.length ; i++) {
		System.out.print(prev[i] +" ");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int arr[] = {15,10,18,12,4,6,2,8};
  int n  = arr.length;
  prev(arr,n);
	}

}
