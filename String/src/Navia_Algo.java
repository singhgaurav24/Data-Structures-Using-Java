
public class Navia_Algo {
    public static void pattern_search(String txt, String pat)
    {
    	int n = txt.length();
    	int m = pat.length();
    	
    	for(int i = 0;i<= n-m;i++)
    	{
    		int j;
    		for(j = 0 ; j<m ;j++)
    			if(txt.charAt(i+j) != pat.charAt(j))
    				break;
    		if(j==m)
    			System.out.println(i);
    				
    	}
   
    }
    
    public static void search(String txt, String pat)
    {
           System.out.println(txt.indexOf(pat));
          
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "BCDABCDAACDBADCBDACBDA";
		String pat = "ABCD";
		
	//	pattern_search(txt,pat);
		search(txt, pat);
		

	}

}
