package Stack;
import java.util.*;
public class getMin {
	
	
	static void push(int x) {
		Stack<Integer> ms = new Stack<Integer>();
		Stack<Integer> as = new Stack<Integer>();
		ms.push(x);
		if(as.peek() >= ms.peek()){
			as.push(x);
		}
		System.out.println(x);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      push(10);
	}

}
