import java.util.Scanner;
public class Leftmost_Repet {
    public static int leftMost(String s1)
    {
    	for(int i = 0; i<s1.length()-1;i++)
    	{
    		for(int j = i+1; j<s1.length();j++)
             {
    			if (s1.charAt(j) == s1.charAt(i)) 	
    	        {
    	        	System.out.print(s1.charAt(i));
    	        }   
             }
      	}
	  return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		String s1 = sc.next();
		leftMost(s1);
		
	}

}
