import java.util.Scanner;

public class Binary_String {
	public static int binarySubstring(String str)
    {
		int count =0;
	    for(int i = 0 ; i < str.length() ; i++)
		{
			if(str.charAt(i) == '1')
			count++;
         }
        return count*(count-1)/2;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc  = new Scanner(System.in);
       System.out.print("Enter the binary string  : "+" ");
       String str = sc.next();
       
       
       System.out.print(" total comination is  :"+" "+binarySubstring(str));
	}

}
