import java.util.*;
import java.util.Map.Entry;
public class Hash_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer , String> m = new HashMap<Integer , String>();
     m.put(1,"gaurav"); // Add key and value pair
     m.put(2,"gaurav"); // 
     m.put(3,"golu");
     
     System.out.println(m);  // print key and value 
     System.out.println("size of :  " + m.size()); // to get size
     
     for(Map.Entry<Integer, String> e : m.entrySet() ) // for traversal
     {
    	 System.out.println("the key : "+e.getKey() +" , has value :  "+e.getValue());
     }
     if(m.containsKey(11)) // to serach an key
     {
     System.out.println("yes , key is present");
     }
     else {
    	 System.out.println("No , key is not present"); 
     }
     
     m.remove(2);   // for removing
     System.out.println("size after :  " + m.size());
     
     if(m.containsValue("golu"))   // search value
     {
     System.out.println("yes , value is present");
     }
     else {
    	 System.out.println("No , value is not present"); 
     }
     
     System.out.println("the value of the key is : " +m.get(1));   //  get value of respective  key
}
}
