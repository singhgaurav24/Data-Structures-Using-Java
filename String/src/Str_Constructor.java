public class Str_Constructor 
{
   public static void main(String[] args) 
	{
		
       String s1  = "Gaurav is is golu";
       String s2  = "Gaurav";   //65
       int x = 10;
       String s = String.valueOf(x);
       System.out.println(s);
       System.out.println(s1);
       System.out.println(s1.replace("is", "singh"));  // 97-65=32
       System.out.println(s1.replaceFirst("is", "singh"));
       System.out.println(s1.replaceAll("\\s",""));
       System.out.println(s2.indexOf("a"));
       System.out.println(s2.lastIndexOf("a"));
       System.out.println(s2.charAt(3));
       System.out.println(s2.contains("m"));
       System.out.println(s2.toLowerCase().startsWith("g"));
       System.out.println(s2.endsWith("x"));
       
	}

}
