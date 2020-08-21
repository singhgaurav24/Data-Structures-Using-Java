import java.util.*;
public class Collections_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Integer> list = new ArrayList<Integer>();
         list.add(10);
         list.add(15);
         list.add(20);
         list.add(25);
         list.add(30);
         list.add(35);
         list.add(40);
         list.add(48);
         System.out.println(list);
         Collections.sort(list);
         System.out.println(list);
         Collections.sort(list , Collections.reverseOrder());
         System.out.println(list);
	}

}
