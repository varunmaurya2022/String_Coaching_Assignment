public class StringPaildrome {
   public static boolean paildrome(String s) {
      System.out.print("Original String :");
      System.out.print(s);
      System.out.println("");
      String s2 = "";
      char[] ch = s.toCharArray();
      System.out.print("Reversed String :");
      for (int i = ch.length - 1; i >= 0; i--) {
         s2 += ch[i];
      }
      System.out.print(s2);
      System.out.println("");
      return s.equals(s2);

   }

   public static void main(String... args) {
      boolean t = paildrome("madam");
      System.out.println(t);
   }

}
