package Recursion;

public class Tower_Of_Hanoi {
	
	//public long moves;
    public static void toh(int N, int from, int to, int aux) {
        // Your code here
    	
        if(N>0)
        {
            toh(N-1,from,aux,to);
            System.out.println("move disk "+N +" from rod "+from +" to rod "+to);
           // moves++;
            toh(N-1,aux,to,from);
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int N = 3;
      int from = 1;
      int to = 3;
      int aux = 2;
      toh(N,from,to,aux);
	}

}
