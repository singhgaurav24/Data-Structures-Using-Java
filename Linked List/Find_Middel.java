public class Find_Middel {
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
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
		// NIVAE SOLUTION
		void printMiddel(Node head)
		{
			if(head == null)
				return;
			
			int count =0;
			
			Node curr;
			
			for(curr = head ; curr != null ; curr = curr.next)
			{
			    count++;
			}
			 curr = head;
			
			 //System.out.println(curr.data);
			 
		
			 System.out.println("total number of Elements in linked list is :" +" " +count);
			 
			 for(int i =0 ; i<count/2 ;i++)
			 
				 curr = curr.next;
				 System.out.println("middel element is :" + " "+curr.data);
			 
		}
		/// m-2
		public void mid()
		{
			Node slow = head;
			Node fast = head;
			while(fast != null && fast.next != null)
			{
				slow = slow.next;
				fast = fast.next.next;
			}
			
			System.out.println(slow.data);
		}
		
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         
		LL l1 = new LL();
	///	l1.insert(15);
		l1.insert(25);
		l1.insert(35);
		l1.insert(45);
		l1.insert(55);
		
		l1.print();
		
		//l1.printMiddel(l1.head);
		
		l1.mid();
	}

}
