
public class Coin_Change_Problem {
     public static int ways(int coins[] , int m , int sum) {
    	 if(sum == 0) {
    		 return 1;
    	 }
    	 if(m == 0) {
    		 return 0;
    	 }
    	 int res = ways(coins , m-1 , sum);
    	 if(coins[m-1] <= sum) {
    		 res = res + ways(coins , m , sum-coins[m-1]);
    	 }
    	 return res;
     }
     
     public static int dpsolution(int coins[] , int m , int sum) {
    	 int dp[][] = new int[sum+1][m+1];
    	 for(int i = 0 ; i  <= m ; i++) {
    		 dp[0][i] = 1;
    	 }
    	 for(int i = 1 ; i  <= sum ; i++) {
    		 dp[i][0] = 0;
    	 }
    	 for(int i = 1 ; i  <= sum ; i++) {
    		 for(int j = 1 ; j  <= m ; j++) {
    			 dp[i][j] = dp[i][j-1];
    			 if(coins[j-1] <= i) {
    				 dp[i][j] += dp[i - coins[j-1]][i];
    			 }
    		 }
    	 }
    	 return dp[sum][m];
    	 
     }
     
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int coins[] =  {1,2,3};
      int m = coins.length;
      int sum  = 4;
      System.out.println(dpsolution(coins,m,sum));
	}
   
}
