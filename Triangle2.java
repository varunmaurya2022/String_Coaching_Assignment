public class Traingle2 {
   public static void triangle2(String s) {
      for (int i = 0; i < s.length(); i++) {
         for (int j = 0; j <= s.length() - i - 1; j++) {
            char c = s.charAt(j);
            System.out.print(c + " ");
         }
         System.out.println("");
      }
   }

   public static void main(String... s) {
      triangle2("appsquadz");
   }
}
