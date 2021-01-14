import java.util.HashMap;
import java.util.Map;
public class Winner_Of_Election {
	public static String[] winner(String arr[], int n)
    {
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
       
        for(int i = 0 ; i<n;i++) {
        	if(hm.containsKey(arr[i])) {
        	hm.put(arr[i], (hm.get(arr[i])+1));
        	}
        	else {
        		hm.put(arr[i],1);
        	}
        }
        int max = 0;
        String str = "";
        
        for(Map.Entry<String,Integer> entry: hm.entrySet()) {
        	if(entry.getValue() > max) {
        		max = entry.getValue();
        		str = entry.getKey();
        	}
        	else if(entry.getValue()==max){
                if(str.compareTo(entry.getKey())>0){
                   str = entry.getKey();
                }
         	}
        }
        String s[] = new String[2];
        s[0] = str;
        s[1] = String.valueOf(max);
        
        return s;
        
        

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String votes[] = {"john","johnny","jackie","johnny","john" ,
    		            "jackie","jamie","jamie","john","johnny","jamie",
    		            "johnny","john"};
      int n = votes.length;
      String st[];
      
      String res[] = winner(votes,n);
      System.out.print(res[0] +"  "+ res[1]);
	}

}
