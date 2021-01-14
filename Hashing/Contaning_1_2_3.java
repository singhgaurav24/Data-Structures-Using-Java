import java.util.HashMap;
import java.util.HashSet;
public class Contaning_1_2_3 {
	
	static HashMap<Integer,Integer> mp = new HashMap<>();

	public static void findAll(int arr[])
	{
	    //Your code here
		for(int i = 0 ; i< 1000000;i++) {
			if(find(i)) {
				mp.put(i,1);
			}
		}
		
	}
	public static boolean find(int num) {
		HashSet<Integer> hs = new HashSet<Integer>();
		if(hs.contains(4) || hs.contains(5) || hs.contains(6)|| hs.contains(7)||
				hs.contains(8)|| hs.contains(9)) {
			return false;
		}
		return true;
		
	}
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
