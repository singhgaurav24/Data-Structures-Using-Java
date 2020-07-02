
public class Tabulation {
  public static long fib(int n) {
	  long f[] = new long[100];   // 1 extra to handle case, n = 0 
	  f[0] = 0;
	  f[1] = 1;
	  for(int i = 2 ; i<=n ; i++) {
		  f[i] = fib(i-1)+fib(i-2);
	  }
		  
	  return f[n];
  }

public static void main(String args[]) {
	//int f[] = {};
	int n = 6;
	
	System.out.println(fib(n));
  }
}