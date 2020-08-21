
public class Insertaion_Sort {
public static void isort(int arr[] , int n) {
	
	for(int i = 0 ; i < n ; i++) {
		int  key = arr[i];
		int j = i-1;
		while(j>=0 && arr[j] > key) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = key;
	}
	for(int i = 0 ; i  < n ; i++) {
	    System.out.print(arr[i]+" ");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {50,20,40,60,10,30};
      int n = arr.length;
      isort(arr,n);
	}

}
