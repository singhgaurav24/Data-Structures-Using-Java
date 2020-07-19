
public class Sum {
	public static long findSum(String s)
    {
        long sum = 0;
        String str[]=s.split("[a-z]+");
        for(int i = 0; i < str.length ; i++) {
        	if(str[i].equals("") == false)
        		sum += Integer.parseInt(str[i]);
        }
         
         
        return sum;
    }
	public static void main(String[] args)
     {
		// TODO Auto-generated method stub
             String s = "1abc23";
             
             System.out.println(findSum(s));
  	}

}
