import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class SmallestSum {

	public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
        	
        	int num = sc.nextInt();
        	int K = sc.nextInt();
        	int A[] = new int[num];
        	for(int i = 0 ; i< num ;i++) {
        		A[i] = sc.nextInt();
        		
        	}
        	int n = sc.nextInt();
        	sol1(A,K);
        	//sol(A,K);
        
        	
        }
}
	public static int sol(int A[], int K) {
		Arrays.sort(A);
		int sum = 0;
		for(int i = 0 ; i< K;i++) {
			sum = sum + A[i];
		}
		return sum;
	}
	public static void sol1(int A[], int x) {
		HashSet<Integer> s = new HashSet<Integer>(); 
		  
        for (int i = 0; i < A.length; i++)  
        {   
            if (s.contains(x ^ A[i]) &&  
                    (x ^ A[i]) == (int) s.toArray()[s.size() - 1])  {
            	System.out.println("Yes");
            }
            else {
            	System.out.println("No");

            }
  
        } 
 
 
	}

}
