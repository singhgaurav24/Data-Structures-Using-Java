package Queue;

public class Queue_Array_Implementaion {

	public static class Queue
	{
		int cap = 5;
		int queue[]  = new int[cap];;
		int size;
		int front,rear;
		
		public void enQueue(int data)
		{
			if(isFull())
				return;
			
			queue[rear] = data;
			rear = (rear+1)%cap;
			size++;
			
		//	System.out.print( data +" ");
		}
		public void dQueue()
		{
			if(isEmpty())
				return;
				
			int data = queue[front];
			front = (front+1)%cap;
			size--;
		}
		
		public int getSize()
		{
			return size;
		}
		
		boolean isEmpty()
		{
			return (size==0);
		}
		
		boolean isFull()
		{
			return (size==cap);
		}
		
		public void show()
		{  
			System.out.print("Elements in the queue are : " +"  ");
			for(int i =0;i<size;i++)
			{
				System.out.print( queue[(front+i)%cap]+" ");
			}System.out.println();
		}
		public void array()
		{
           for(int n : queue)
           {
        	   
        	   System.out.print(n +"  ");
           }
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.enQueue(2);
		q.enQueue(15);
		q.enQueue(25);
		q.enQueue(35);
		q.enQueue(45);
		q.dQueue();
	    q.enQueue(255);
	    
	
	    q.dQueue();
	    q.dQueue();
	    q.enQueue(100);
	    q.enQueue(125);
	    
	    System.out.println("size" +" " + q.getSize());
	    System.out.println(q.isEmpty());
	    System.out.println(q.isFull());
		q.show();
		q.array();
	}

}
