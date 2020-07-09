/*
   Given a String of length S, reverse the whole string 
    without reversing the individual words in it.
   Words are separated by dots.
*/
public class Reverse_String {
 public static void reverse(String str) {
	 String[] s = str.split("\\.");
	 int n = s.length-1;
	 // Method 03
	 
	 for(int  i = n ; i >0 ;i--) {
		 System.out.print(s[i]+".");
	 }
	 System.out.print(s[0]);
	 /* method 02
	 for(int i = n ; i>=0;i--) {
		 System.out.print(s[i]);
		 if(i>0) {
			 System.out.print("."); 
		 }
	 }
	 
	 */
	 /*  Method 01
	  
	 int i=0;
	 while(i<n) {
		 String s1 = s[i];
		 s[i]  = s[n];
		 s[n] = s1;
		 i++;
		 n--;
	 }
	  
     */
	 
	 
	 
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str = "myself.gaurav.kumar.singh";
   
   reverse(str);
	}

}
