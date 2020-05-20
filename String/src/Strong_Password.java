import java.util.Scanner;
public class Strong_Password {
	
	public static void password(int n , String s)
	{
		int count =0;
		
		if(!s.matches("[0123456789]"));
		{
			count++;
		}
		if(!s.matches("[abcdefghijklmnopqrstuvwxyz]"));
		{
			count++;
		}
		if(!s.matches("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]"));
		{
			count++;
		}
		if(!s.matches(".*[!@#$%^&*()-+]+.*"));
		{
			count++;
		}
		int lengthDifference = 6 - s.length();

	    if(lengthDifference > 0 && count <= lengthDifference) {
	       System.out.print(lengthDifference);
	    }
	    System.out.print(count);
		
	}
static int minimumNumber(int n, String password) {
        
        int lc=0,uc=0,no=0,sc=0;
        int sum=0;
        
        String lowercase = ".*[a-z]+.*";
        String uppercase = ".*[A-Z]+.*";
        String num = ".*[0-9]+.*";
        String specialchar = ".*[-!@#$%^&*()+]+.*"; 
        //Regex for pattern matching
        
        if(!(password.matches(lowercase)))
            lc++; 
        //if there is no match to a lowercase,"lc" is increased by 1.
    
        if(!(password.matches(uppercase)))
            uc++; 
        //if there is no match to an uppercase,"uc" is increased by 1.
    
        if(!(password.matches(num)))
            no++; 
        //if there is no match to a number,"no" is increased by 1.
    
        if(!(password.matches(specialchar)))
            sc++; 
        //if there is no match to a specialCharacter,"sc" is increased by 1.
        
        
        sum=lc+uc+sc+no;
        
        return (sum>(6-n))?sum:(6-n);
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        @SuppressWarnings("resource")
      
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String password = sc.next();
        //password(n,s);
        System.out.print(minimumNumber(n,password));
	}

}
