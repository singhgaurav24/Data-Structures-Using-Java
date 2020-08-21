import java.util.Arrays;

public class Arrays_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr1[] = {10,5,4,88,15,12,48,42,1542};
      char arr2[] = {'A','S','C','R','S','D','F','G'};
    //  Arrays.sort(arr1);
      Arrays.sort(arr2);
      /*
       // traversal of array using for loop 
      for(int i = 0 ; i  < arr1.length;i++) {
    	  System.out.print(arr1[i]+ " ");
      }
      */
   //   System.out.print(Arrays.toString(arr1));
      System.out.println();
      System.out.print(Arrays.toString(arr2));
      System.out.println();
      
      Arrays.sort(arr1 , 1 ,5);
      System.out.print(Arrays.toString(arr1));
      
	}

}
