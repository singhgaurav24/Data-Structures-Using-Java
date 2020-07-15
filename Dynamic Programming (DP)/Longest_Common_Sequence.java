
public class Longest_Common_Sequence {
public static int lcs(String s1 , String s2 , int n , int m) {
	
	if(m==0 || n==0) {
		return 0;
	}
	if(s1.charAt(n-1) == s2.charAt(m-1)){
		return 1+lcs(s1,s2,m-1,n-1);
	}
	else {
		return Math.max(lcs(s1,s2,n-1,m),lcs(s1,s2,n,m-1));
	}
	
}

public static int lcsmemo(int p , int q , String s1 , String s2) {
	int dp[][]=new int[p+1][q+1];
	for(int i=0;i<=q;i++)
	dp[0][i]=0;
	for(int i=0;i<=p;i++)
	dp[i][0]=0;
	for(int i=1;i<=p;i++) {
	for(int j=1;j<=q;j++) {
	if(s1.charAt(i-1)==s2.charAt(j-1))
	dp[i][j]=1+dp[i-1][j-1];
	else
	dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
	}
	}
	return dp[p][q];
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1 = "axyz";
       String s2 = "baz";
       int p = s1.length();
       int q = s2.length();
       System.out.println(lcsmemo(p,q,s1,s2));
       
	}

}
