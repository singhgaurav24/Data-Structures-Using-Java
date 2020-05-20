
public class Sum {
     public static void findSum(String str)
     {
    	 System.out.println(str);
    	String  s1 = str.replaceAll("[aA-zZ]", "");
    	System.out.println(s1);
    	//int s2 = Integer.parseInt(s1);
    	String s[]=str.split("[a-z]+");
    	int sum =0;
    	for(int i=0; i<str.length()-1; i++) {
    		if(!s[i].equals(""))
    			sum += Integer.parseInt(s[i]);
//    	    char temp = str.charAt(i);
//    	    if (Character.isDigit(temp)) {
//    	        int b = Integer.parseInt(String.valueOf(temp));
//    	        sum=sum+b;
    	    
    	}
    	System.out.println(sum);
     }
	public static void main(String[] args)
     {
		// TODO Auto-generated method stub
       String str = "1a5v15d1d7";
       findSum(str);
	}

}
