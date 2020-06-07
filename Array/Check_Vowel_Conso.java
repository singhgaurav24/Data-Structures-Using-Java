
public class Check_Vowel_Conso {
    static void checkVowel(String s)
    {
    	int v=0;
    	int c=0;
    	
    	s = s.toLowerCase();
    	
    	for(int i=0;i<s.length();i++)
    	{
    		char ch = s.charAt(i);
    		if(ch=='a' || ch == 'e' || ch == 'i' || ch=='o' || ch =='u' )
    		{
    			v++;
    		}
    		else if((ch >= 'a'&& ch <= 'z'))
    		{
    			c++;
    		}
    	}
    	
    	 
    	
    	
   
    	
    	if(v>c)
            System.out.print("Yes");
            else if(c>v)
            System.out.print("No");
            else
           System.out.print("Same");
            
            System.out.println();
            
           
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s = "Gaurav kumar singh";
        
        checkVowel(s);
        
	}

}
