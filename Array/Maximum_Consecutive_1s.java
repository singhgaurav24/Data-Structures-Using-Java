
public class Maximum_Consecutive_1s {
   static void solution(int arr[])
   {
	   int  count = 0;
	   for(int i= 0 ;i <arr.length;i++)
	   {
		   int curr = 0;
		   for(int j = i ;j<arr.length;j++)
		   {
			   if(arr[j] == 1)
			   
				   curr++;
			   else
				   break;
		   }
		   count = Math.max(curr, count);
	   }
	   System.out.println(count);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[] = {0,1,1,0,1,0};
     solution(arr);
	}

}
