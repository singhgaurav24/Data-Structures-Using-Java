import java.util.Scanner;
public class palindrome {
	
	public static boolean isPalindrome(String s) {
	    if(s==null){
	        return false;
	    }
	 
	    s = s.toLowerCase();
	    s = s.replaceAll("[^a-z0-9]","");
	    int n = s.length();
	    for(int i = 0 ; i < n/2 ;i++) {
	    	if(s.charAt(i) != s.charAt(n-i-1))
	    		return false;
	    }
	    return true;
	   /*
	     int i= 0;
	    int j= s.length()-1;
	 
	    while(i<j){
	        while(i<j && !((s.charAt(i)>='a' && s.charAt(i)<='z') 
	                    || (s.charAt(i)>='0'&&s.charAt(i)<='9'))){
	            i++;
	        }
	 
	        while(i<j && !((s.charAt(j)>='a' && s.charAt(j)<='z') 
	                    || (s.charAt(j)>='0'&&s.charAt(j)<='9'))){
	            j--;
	        }
	 
	        if(s.charAt(i) != s.charAt(j)){
	            return false;
	        }
	 
	        i++;
	        j--;
	    }
	 
	    return true;
	    
	    */
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.next();
        System.out.println(isPalindrome(s));
        
	}
}	


