import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
      /*  String st = "";
        	for(int j = str.length()-1;j>=0;j--)
        	{
        		st = st+str.charAt(j);
        	}
        	if(str.equals(st))
    		
    			System.out.println("trur");
    			
    		
    		else
    		
    			System.out.println("fff");
    	*/
        char[] ch = str.toCharArray();
        char temp;
        int j;
        for(j = str.length()-1 ;j>=0;j--)
        {
        	System.out.print(ch[j]+" ");
        }
        
		System.out.println(ch[j]);
//        if(str.equals(ch));
//        {
//         System.out.println("trur");
//        }
//        
//        }
	}
}


