package Stack;



public class Linked_List_Implemention {
	
	static class Node
	{
	  int data;
	  Node next;
	  Node(int d)
	  {
		  data =d;
	  }
	  
	}
	
	 static class Stackk
	 {
		 int length = 0;
	 
		 Node head =null;
		 void push(int data)
		  {
		     Node ns = new Node(data);
		     ns.next = head;
		     head = ns;
		     length++;
		     System.out.println(data + "  "+"is pushed ");
		  }
		 
		 void pull()
		 {
			 
		 }
	 }
	  
  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stackk sc = new Stackk();
		sc.push(120);
		sc.push(125);
		
	}
}

	
