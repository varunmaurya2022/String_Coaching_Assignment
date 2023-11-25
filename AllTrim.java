public class AllTrim {
   public static String alltrim(String s) {
      System.out.print("Original String : " + s);
      System.out.println("");
      String str = s.replaceAll("\\s", "");
      return str;
   }

   public static void main(String... args) {
      String s1 = alltrim("    This i s String    ");
      System.out.println("");
      System.out.print("AllTrim String : " + s1);
   }
}
