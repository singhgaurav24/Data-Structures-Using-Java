import java.util.Scanner;
public class Strng_Comper {
	public static void getSmallestAndLargest(String s, int k)
	{
   //		String smallest = "";
  //         String largest = "";
         String temp = "";
        // System.out.println(s.length());
        for(int i = 0; i<=s.length()-1;i++)
          {
        	temp = s.substring(i,i+k);
        	System.out.println(temp);
          }
        
        
        
        //return temp;
        
//        smallest = largest = s.substring(0,k);
//        for(int i = 0; i<s.length();i++)
//        {
//        	
//        }
//        
//		return smallest + "\n" + largest;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        
        getSmallestAndLargest(s,k);
        
        
        
        
        
        
        
        
        
        
//        String s1 = new StringBuffer(s).reverse().toString();
//        
//       // char[] ch = s.toLowerCase().toCharArray();
//        //System.out.println(getSmallestAndLargest(s, k));
////        String[] s1 ="";
////        String s2 ="";
////        int i,j;
////        for(i =0;i<s.length();i++)
////        {
////        	
////        	System.out.print(s1[i]);		
////        }
//        System.out.println(s1);
////        for(j = s.length()-1; j>=0;j--)
////    	{
////        	System.out.print(ch[j]);
////    	}
////        if()
////        {
////        	System.out.println("tt");
////        }
////        else
////        {
////        	System.out.println("ff");
////        }
        
	}

}
