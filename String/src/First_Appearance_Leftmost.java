
public class First_Appearance_Leftmost {
	static int repeatedCharacter(String S) {
        // add your code here
		for(int i = 0 ; i < S.length();i++) {
			for(int j = i+1;j<S.length();j++) {
				if(S.charAt(i) == S.charAt(j))
					return S.charAt(i);
			}
			
		}
		return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String S ="geeksforgeeks";
      System.out.println(repeatedCharacter(S));
	}

}
