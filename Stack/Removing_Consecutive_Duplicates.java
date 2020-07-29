package Stack;
import java.util.*;
public class Removing_Consecutive_Duplicates {
	public static String removeConsecutiveDuplicates(String str){
        // Your code here
		Stack<Integer> st = new Stack<Integer>();
		String res = "";
		for(int i = 0 ; i < str.length() ;i++) {
			if(st.isEmpty() || st.peek() != str.charAt(i)) {
			st.push((int) str.charAt(i));
			res += str.charAt(i);
		   }
		}
		return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str = "aaaaaabaabccccccc";

    System.out.print(removeConsecutiveDuplicates(str));
    
	}

}
