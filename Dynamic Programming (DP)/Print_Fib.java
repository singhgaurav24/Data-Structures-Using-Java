import java.util.Scanner;
public class Print_Fib {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number of test case");
     int t = sc.nextInt();
     while(t-- >  0) {
    	 System.out.println("Enter number");
    	 int n = sc.nextInt();
    	 fib(n);
    	 
     }
    	 
	}
	static void fib(int n) {
		long f[] = new long[100];   // 1 extra to handle case, n = 0 
		  f[0] = 0;
		  f[1] = 1;
		  for(int i = 2 ; i<=n ; i++) {
			  f[i] = f[i-1] + f[i-2];
		  }
		  for(int i = 0 ; i<=n;i++) {
			  System.out.print(f[i] +" ");
		  }
		    System.out.println();
	}
}
