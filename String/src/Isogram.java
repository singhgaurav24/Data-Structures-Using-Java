import java.util.*;
public class Isogram {
	static boolean isIsogram(String data){
	    //Your code here
		 String[] ary = data.split("");
	        Set<String> mySet = new HashSet<String>();
            for(int i = 0 ; i < ary.length;i++) {
            	mySet.add(ary[i]);
            }
	        if(data.length() == mySet.size()){
	            return true;
	        }else{
	            return false;
	        }
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String data = "gaurav";
    System.out.println(isIsogram(data));
    
	}

}
