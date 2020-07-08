import java.util.*;
public class Common_Char {
public static void concatenatedString(String s1,String s2){
	String s3 = "";
	for(int i = 0 ; i  <s1.length();i++) {
		for(int j = 0 ; j< s2.length();j++) {
			if(s1.charAt(i) == s2.charAt(j)) {
				s3 += s1.charAt(i);
			}
		}
	}
	for(int i = 0; i < s3.length(); i ++) {
		String charToRemove = s3.charAt(i)+"";
		s1 = s1.replace(charToRemove, "");
		s2 = s2.replace(charToRemove, "");
		}
		String s4= s1+s2;
		
	System.out.println(s4);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1 = "abbcd";
    String s2 = "abcaasdg";
 
     concatenatedString(s1,s2);
	}

}
