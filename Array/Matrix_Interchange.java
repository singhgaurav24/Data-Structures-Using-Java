
public class Matrix_Interchange 
{
       
	static void interchange(int arr[][], int r, int c )
	{
		for(int i=0;i<r;i++)
		{
		    int temp = arr[i][0];
			arr[i][0] = arr[i][c-1];
			arr[i][c-1] = temp;
			
                  for(int j = 0;j<c;j++){
                	
             System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {{1,2,3,4},{1,3,4,5},{1,5,5,6},{2,4,6,6}};
        interchange(arr,4,4);
		
	}

}
