public class Non_Repeating_Character {
   /*
	static int nonrepeatingCharacter(String S){
		int i;
		Boolean flag = false;
        for(i = 0 ; i<S.length();i++) {
           for(int j =  0 ; j<S.length();j++) {
        	   if(i != j && S.charAt(i) == S.charAt(j)) {
        		   flag = true;  
        		   break;
        	   }
           }  
        	   if(flag == false) {
        		return i;
        	
           }
        }
		return -1;
    }
	*/
	public static int repeat(String str) {
		int CHAR = 256;
		int count[] = new int[CHAR];
		for(int i = 0 ; i < str.length();i++) {
			count[str.charAt(i)]++;
		}
		for(int i = 0 ; i  <str.length();i++) {
			if(count[str.charAt(i)] == 1) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String str = "gauravg";
     System.out.println(repeat(str));
	}

}
