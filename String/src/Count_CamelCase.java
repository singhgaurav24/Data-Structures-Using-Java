import java.util.Scanner;
public class Count_CamelCase {
	
	static void countWord(String s)
	{
		// Method 01
		/*  
		 
	    String arr[]= s.split("[A-Z]");
	    System.out.println(arr.length);
	    
	     */
	    // Method 02
		
	    String s1 = s.replaceAll("[A-Z]", "");
	    System.out.println(s1);
		int n1 = s.length();
		int n2 = s1.length();
		int n3 = n1-n2+1;
		System.out.println(n3);
	    
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String ");
      String s = sc.next();
      countWord(s);
	}

}
