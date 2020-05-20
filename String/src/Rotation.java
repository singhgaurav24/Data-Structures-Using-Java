
public class Rotation {
      public static boolean areRotation(String s1 , String s2)
      {
    	  if(s1.length() != s2.length())
    		  return false;
    	  s1 = s1+s1;
    	  //System.out.println(s1.indexOf(s2)>0);
    	  return (s1.indexOf(s2)>0);
    	  
    	 
      }
      public static boolean issRotated(String s1, String s2){
          
          // Your code here
         if(s1.equals(s2) && s1.length()>2)
           return false;
           s1 = s1+s1;
          return s1.contains(s2);
            
          
      }
      public static boolean isRotated(String s1, String s2) {

    		/**Your code here**/
    		int len1 = s1.length();
    		/**Comparing lengths of both Strings**/
    		if (len1 != s2.length())
    			return false;
    		/**When String length is 1**/
    		if (len1 == 1)
    			return s1.equals(s2);
    		return (s1.substring(2) + s1.substring(0, 2)).equals(s2) || /**Left rotation**/
    				(s2.substring(2) + s2.substring(0, 2)).equals(s1); /**Right rotation**/
    	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "amazon";
		String s2 = "azonam";	
		//areRotation(s1 ,s2);
		if(isRotated(s1 ,s2))
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
	}

}
