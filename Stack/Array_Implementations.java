package Stack;
public class Array_Implementations {
	
static class PushPop
{
	int cap = 500;
	int arr[] = new int[cap];
    
	int top = -1;
	
	void push(int x)
	{
		 if (top >= (cap-1))
	        {
	            System.out.println("Stack Overflow");
	            
	        }
		 else
		 {
	   	top++;
		arr[top] = x;
		System.out.println(x+"    "+"is pushed");
	}}
	int pop()
	{
		 if (top < 0)
	        {
	            System.out.println("Stack Underflow");
	            return 0;
	        }
		int res = arr[top];
		top--;
		return res;
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PushPop p = new PushPop();
        p.push(10);
        p.push(1542);
        p.push(12);
        p.push(120);
        p.push(1120);
        p.pop();
        
  
        System.out.println(p.pop()+"    "+"is pop");
	}

}
