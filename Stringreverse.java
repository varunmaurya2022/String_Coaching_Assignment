public class Stringreverse {
   public static String reverse(String s) {
      char[] ch = s.toCharArray();
      String s2 = "";
      for (int i = ch.length - 1; i >= 0; i--) {
         s2 += ch[i];
      }
      return s2;
   }

   public static void main(String... args) {
      String s4 = reverse("Hello");
      System.out.println(s4);
   }
}
