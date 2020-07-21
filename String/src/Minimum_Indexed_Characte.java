
public class Minimum_Indexed_Characte {
	public static int minIndexChar(String str, String pat){
        for(int i = 0 ; i < str.length() ; i++) {
        	if(str.charAt(i) == pat.charAt(i)) {
        		return str.charAt(i);
        	}
        }
        return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str = "geeksforgeeks";
   String pat = "set";
   if(minIndexChar(str,pat) == -1) {
	   System.out.println("No character present");
   }
   else {
	   System.out.println(minIndexChar(str,pat));
	   
   }
	}

}
