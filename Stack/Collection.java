package Stack;

import java.util.*;

public class Collection {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(50);
		
		System.out.print("elements in the Stack :" +" "+ s +" ");
		//s.pop();
		System.out.println();
		//System.out.print(s +" ");
		
		while(s.isEmpty() == false)
		{
			System.out.print(s.pop()+" ");
		}
		System.out.println();
		System.out.print(s +" ");
		
		s.push(222);
		s.push(1542);
		s.push(1542);
		
		System.out.println();
		System.out.println(s+ " ");
		
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.search(1542));
		

	}

}
