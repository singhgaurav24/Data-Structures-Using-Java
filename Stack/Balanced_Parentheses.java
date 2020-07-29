package Stack;
import java.util.*;
public class Balanced_Parentheses {
	public static boolean isBalanced(String str) {
		Stack<Character> st = new Stack<Character>();
		
		for(int i =0 ;i< str.length() ;i++) {
			char ch = str.charAt(i);
			if(str.charAt(i) == '[' || str.charAt(i) == '{' || str.charAt(i) == '(') {
				st.push(str.charAt(i));
			}
			else {
				if(st.empty()) {
					return false;
				}
				else if(matching(st.peek() , str.charAt(i)) == false) {
					return false;
				}
				else {
					st.pop();
				}
			}
			
		}
		if(st.empty()) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	public static boolean matching(char a ,char b) {
		return ((a == '(' && b == ')') || (a == '{' && b == '}') ||(a == '[' && b == ']'));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "[({[([{}])]})]"; 
  		
        System.out.println(isBalanced(str));
		
	}		
}