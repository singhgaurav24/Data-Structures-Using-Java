import java.util.Arrays;

public class Median_Mean {

	static void mean(int arr[], int n)
	{
		int sum =0;
		for(int i=0;i<n;i++)
		{
			sum += arr[i];
		}
		int mean = sum/n;
		System.out.println(sum);
		System.out.println(mean);
	}
	static void median(int arr[], int n)
	{
		Arrays.sort(arr);
		//for(int i=0;i<n;i++)
		//{
			//System.out.print(arr[i]+" ");
			int med=0;
			if(n%2==0)
			{
				int a = n/2;
				int b = (n+1)/2;
				System.out.print((arr[a]+arr[b])/2);
			}
			else
			{
				System.out.print(arr[n/2]);
			}
			
		//}	
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {2,5,3,4,7,9};
        mean(arr,5);
        median(arr,5);
	}

}
