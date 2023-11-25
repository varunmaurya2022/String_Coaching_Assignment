public class Triangle2 {
   public static void triangle2(String s) {
      for (int i = 0; i < s.length(); i++) {
         for (int j = s.length(); j > i; j--) {
            System.out.print(j + " ");
         }
         System.out.println("");
      }
   }

   public static void main(String... args) {
      triangle2("appsquadz");
   }
}
