import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void findAnagram()
	{
//		if(s1.length() == s2.length())
//		{
//			//int count =0;
//			for(int i =0 ;i<=s1.length();i++)
//			{
//				for(int j =0; j<=s2.length();j++)
//				{
//					
//				}
//			}
//		}
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		sc.nextLine();
		String s2 = sc.next();
//		String s1 = "gaurav";
//		String s2 = "gauvaR";
		char[] ch1 = s1.trim().toLowerCase().toCharArray();
		char[] ch2 = s2.trim().toLowerCase().toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.equals(ch1,ch2));
		
	}
	public static boolean isAnagram(String s1,String s2)
    {
        
        // Your code here
        char[] ch1 = s1.trim().toCharArray();
	    char[] ch2 = s2.toCharArray();
	
	    Arrays.sort(ch1);
		Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);     
        
    }
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		sc.nextLine();
		String s2 = sc.next();
         //findAnagram();
	    // isAnagram(s1,s2);
       if(isAnagram(s1,s2))
       {
    	   System.out.println("true");
    	  
       }
       else
       {
    	   System.out.println("false"); 
       }
        
	}

}
