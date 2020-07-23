package Stack;
import java.util.*;
public class Remove_Pair_Consecutive {
	public static String removePair(String str){
		
		Stack<Character> st = new Stack<Character>();
		for(int i = 0 ; i<str.length() ;i++) {
			if(st.empty()) {
				st.push(str.charAt(i));
				
			}
			else if(st.peek() == str.charAt(i)){
				st.pop();
			}
			else {
				st.push(str.charAt(i));
			}
		}
			
	        if(st.empty())
	            return "Empty String";
	        StringBuffer sb = new StringBuffer();
	        while(!st.empty()){
	            sb.append(st.peek());
	            st.pop();
	        }
	        sb.reverse();
	        return sb.toString();
		
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s1 = "aabbaacc";
       System.out.print(removePair(s1));
	}

}
