
public class Pangram_Checking {
	public static boolean checkPangram(String S) {
		String s = S.toLowerCase();
		if(s.contains("a") && s.contains("b") && s.contains("c")&& s.contains("d")
				      && s.contains("e")&& s.contains("f")&& s.contains("g") && s.contains("h")
				      && s.contains("i")&& s.contains("j")&& s.contains("k")
				      && s.contains("l")&& s.contains("m")&& s.contains("n")&& s.contains("o")
				      && s.contains("p")&& s.contains("q")&& s.contains("r")&& s.contains("s")
				      && s.contains("t")&& s.contains("u")&& s.contains("v")&& s.contains("w")
				      && s.contains("x")&& s.contains("y")&& s.contains("z")) {
			return true;
		}
		else {
			return false;
		}
		
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s  = "Bawds jog, flick quartz, vex nymph";
     System.out.println(checkPangram(s));
	}

}
