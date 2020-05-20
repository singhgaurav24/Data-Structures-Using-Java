
public class Find_Lps {
   int lps(String str , int n)
   {
	   boolean flag = true;
	   for(int  i = n-1 ; i>0;i--)
	   {
		   for(int j = 0 ;j<str.length();j++)
		   {
			   if(str.charAt(j) != str.charAt(n - i +j))
				   flag = false;
			   if(flag == true)
				   return i;
		   }
	   } 
	   return 0;
   }
   void fill_Lpa(String str, int lpa[])
   {
	   for(int i =0; i<str.length();i++)
	      lpa[i] = lps(str , i+1);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "AABCDAABCDACCBADACBDA";
		
	}

}
