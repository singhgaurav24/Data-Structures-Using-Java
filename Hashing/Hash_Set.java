import java.util.*;
public class Hash_Set {
	HashSet<Integer> hs = new HashSet<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashSet<Integer> h = new HashSet<Integer>();
    h.add(10); // to add an item
    h.add(15);
    h.add(16);
    h.add(18);
   
    System.out.println(h);  // item in hash table
    System.out.println(h.contains(25));  // for searching
    
    Iterator<Integer> i = h.iterator();  // for traversal of item
    while(i.hasNext())
    {
    	System.out.println(i.next());
    }
    System.out.println("size of hashset is  : "+ h.size());// to know size
    
    System.out.println(h.remove(15));  // to remove an item
    System.out.println("size of hashset after removing is  : "+ h.size());
    System.out.println(h.isEmpty());  // to check is empty or not
    h.clear();
    System.out.println("size of hashset after clear is  : "+ h.size()); 
	}

}
