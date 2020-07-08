
public class Maximum_Occuring_Character {
public static char getMaxOccuringChar(String line){
        
	 int[] freqArr = new int[256];
	    int maxFreq =0, len = line.length();
	    char ch  = 0;
	    for(int i=0; i<len; i++){
	        freqArr[line.charAt(i)]++;
	        
	        if(freqArr[line.charAt(i)]>maxFreq){
				maxFreq = freqArr[line.charAt(i)];
	            ch = line.charAt(i);
	        }
	        if(freqArr[line.charAt(i)]==maxFreq && (line.charAt(i)<ch))
	            ch = line.charAt(i);
	        
	    }
	   
	    return ch;
	
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String line = "guravvg";
   System.out.println(getMaxOccuringChar(line));
   
	}

}
