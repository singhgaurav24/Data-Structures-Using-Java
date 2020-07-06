import java.util.Scanner;
public class Keypad_Typing {
public static void typing(String str) {
	char[] ch = str.toCharArray();
	for(int i = 0 ; i < ch.length;i++)
	{
		if(ch[i] >= 97 && ch[i] <= 99) {
			System.out.print("2");
		}
		if(ch[i] >= 100 && ch[i] <= 102) {
			System.out.print("3");
		}
		if(ch[i] >= 103 && ch[i] <= 105) {
			System.out.print("4");
		}
		if(ch[i] >= 106 && ch[i] <= 108) {
			System.out.print("5");
		}
		if(ch[i] >= 109 && ch[i] <= 111) {
			System.out.print("6");
		}
		if(ch[i] >= 112 && ch[i] <= 115) {
			System.out.print("7");
		}
		if(ch[i] >= 116 && ch[i] <= 118) {
			System.out.print("8");
		}
		if(ch[i] >= 119 && ch[i] <= 122) {
			System.out.print("9");
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
        while(t-- > 0) {
    	  String str = sc.next(); 
    	  typing(str);
    	  System.out.println();
       }
    	   
	}

}
