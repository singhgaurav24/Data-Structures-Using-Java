

public class Nth_Node_From_End {
	
	
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			this.data = d;
		}
	}
	
	static class LL
	{
		Node head;
		void insert(int x)
		{
			Node temp = new Node(x);
			temp.next = head;
			head = temp;
			
		}
		
		void print()
		{
			Node n = head;
			System.out.print("Elements of Linked List is: ");
			while(n!=null)
			{
				
				System.out.print(n.data+ " ");
				n = n.next;
			}
			    System.out.println();
		}
		
		void nth_Node_From_End(int n)
		{
			int length = 0;
			Node curr;
			for(curr = head ; curr != null ;curr = curr.next)
			{
				length++;
			}
		    curr = head;
			System.out.println("No of elements in the list is : "+ " " + length);
			
			if(length<n)
			{
			   System.out.println("number is grather than no of elements");
			   return;
			}  
			for(int i =1;i<(length-n+1);i++)
			{
				curr = curr.next;
			}
			System.out.println(curr.data);		
		}
		
		public void nth_node(Node head , int n)
		{
			Node first = head.next;
			Node second = head;
			while(first != null)
			{
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LL l1 = new LL();
		l1.insert(15);
		l1.insert(25);
		l1.insert(35);
		l1.insert(45);
		l1.insert(55);
		
		l1.print();
		
		l1.nth_Node_From_End(2);

	}

}
