public class Triangle {
   public static void triangle(String s) {
      for (int i = 0; i < s.length(); i++) {
         for (int j = 0; j <= i; j++) {
            char c = s.charAt(j);
            System.out.print(c + " ");
         }
         System.out.println("");
      }
   }

   public static void main(String... args) {
      triangle("appsquadz");
   }

}
