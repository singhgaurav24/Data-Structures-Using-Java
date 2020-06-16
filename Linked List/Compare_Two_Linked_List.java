public class Compare_Two_Linked_List {
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
		static boolean compareLists(Node head1 , Node head2) {
			
			if(head1 == null && head2 == null) 
	             return true;
			
	           while(head1 != null  && head2 != null){

	               if(head1.data == head2.data)
	               {
	                   break;
	               }
	               if(head1.next == null && head2.next == null)
	               {
	                   return true;
	               }
	               head1 = head1.next;
	               head2 = head2.next;
	           }
	           return false;

	    }
		
		void print()
		{
			Node n = head;
			System.out.print(" Elements of Linked List is:  ");
			while(n!=null)
			{
				
				System.out.print(n.data+ " ");
				n = n.next;
			}
			    System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LL l1 = new LL();
        LL l2 = new LL();
        l1.insert(10);
        l1.insert(15);
        
        l2.insert(10);
        l2.insert(15);
        l2.insert(20);
        
//        l1.print();
//        l2.print();
        
        if(l1.compareLists(l1.head , l2.head) == true)
        {
        	System.out.println("Identical");
        }
        else {
        	System.out.println("Not Identical");
        }
	}

}
