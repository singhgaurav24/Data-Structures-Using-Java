import java.util.*;
public class Non_Repeating {
	static ArrayList<Integer> firstNonRepeating(int arr[], int n) { 
		ArrayList<Integer> a = new ArrayList<Integer>();
        LinkedHashMap<Integer, Integer> m = new LinkedHashMap<>(); 
        for (int i = 0; i < n; i++) { 
            if (m.containsKey(arr[i])) { 
                m.put(arr[i], m.get(arr[i]) + 1); 
            } 
            else { 
                m.put(arr[i], 1); 
            } 
        } 
        for (Map.Entry<Integer, Integer> x : m.entrySet()) 
            if (x.getValue() == 1) {
            	a.add(x.getKey());
            }
        return a;
    } 
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the length of array ");
     int n = sc.nextInt();
     int arr[] = new int[n];
     System.out.print("Enter Element of the array :- ");
     for(int i = 0 ; i < arr.length;i++) {
    	 arr[i] = sc.nextInt();
     }
     System.out.print("Element of the array are :- ");
    	 for(int i = 0 ; i < arr.length; i++) {
    		 System.out.print(arr[i]+" ");
    	 }
    	 System.out.println();
    	 
    	System.out.print(firstNonRepeating(arr,n));
		     
        
	}
	
	
}
