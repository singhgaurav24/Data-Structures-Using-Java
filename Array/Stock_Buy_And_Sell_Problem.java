
public class Stock_Buy_And_Sell_Problem {
     static void maxProfit(int arr[])
     {
        int profit = 0 ;
        for(int i = 1 ; i<arr.length;i++)
    	 {
    		 if(arr[i] > arr[i-1])
    		 {
    	        profit +=(arr[i]-arr[i-1]); 		 
    		 }
    	 }
        System.out.println(profit);
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {1,5,3,8,12};
      maxProfit(arr);
	}

}
