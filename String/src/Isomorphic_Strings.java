import java.util.*;
public class Isomorphic_Strings {
   public static boolean isomorphic(String S1,String S2)
   {
	   if(S1.length()!=S2.length()){
		   return false;
		   }
		   int count1[] = new int[256];
		   int count2[] = new int[256];
		   for(int i = 0; i < S1.length(); i++){
		   if(count1[S1.charAt(i)] != count2[S2.charAt(i)]){
		   return false;
		   }else{
		   count1[S1.charAt(i)]++;
		   count2[S2.charAt(i)]++;
		   }
		   }
		   return true;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1 = "xyy";
       String s2 = "abb";
       System.out.println(isomorphic(s1,s2));
	}

}
