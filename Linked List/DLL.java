public class DLL {
	static class Node
	{
		   int data;
		   Node next;
		   Node prev;
		   Node(int d)
		   {
			   data = d;
		   }
	}
	static class DoubelyLL
	{
		Node head;
		Node tail =null;
		
		 public void addNode(int data)
		 {
			 Node new_node = new Node(data);  ///creating node
			 if(head == null)
			 {
				 head = tail = new_node;
				 head.prev = null;
				 tail.next = null;
			 }
			 else
			 {
				 tail.next = new_node;
				 
				 new_node.prev = tail;
				 tail = new_node;
				 tail.next = null;
			 }
		 }
		 
		 public void addAtFront(int data)
		 {
			 Node new_node = new Node(data);
			 new_node.next = head;
			 new_node.prev = null;
			 if(head != null)
				 head.prev = new_node;
			     head = new_node;
		 }
		 
		 public void insertAfter(Node prev_node ,int data)
		 {
			 if(prev_node == null)
			 {
				 System.out.println("Previous node can not be null");
				 return;
			 }
			 
			  Node new_node = new Node(data);
			  new_node.next = prev_node.next;
			    prev_node.next = new_node;
			    new_node.prev = prev_node;
			    
			    if (new_node.next != null) 
			        new_node.next.prev = new_node; 
		 }
		 
		 public void insertAtLast(int data)
		 {
			 Node new_node = new Node(data);
			 
			 new_node.next = null;
			 if(head == null)
			 {
				 new_node.prev = null;
				 head = new_node;
				 return;
			 }
			 Node last = head;
			 while(last.next != null)
			 {
				 last = last.next;
				 last.next = new_node;
				 new_node.prev = last;
			 }
		 }
		 
		 public void print()
		 {
			 Node current = head;
			 if(head == null)
			 {
				 System.out.println("List is empty");
				 return;
			 }
			 System.out.print("Nodes of DLL is : " +"  ");
			 while(current != null)
			 {
				 System.out.print(current.data+" ");
				 current = current.next;
			 }
		}
		
	}
	
	
	public static void main(String[] args) {
		DoubelyLL l1 = new DoubelyLL();
		/*
		l1.addNode(10);
		l1.addNode(15);
		l1.addNode(17);
		l1.addNode(19);
		l1.addNode(25);
		l1.addNode(35);
		*/
		
		l1.insertAtLast(144);
		
		l1.addAtFront(10);
		l1.addAtFront(12);
		l1.addAtFront(14);
		l1.addAtFront(16);

		l1.insertAfter(l1.head.next.next.next,1500);
		
		l1.print();
		  
	}

}
