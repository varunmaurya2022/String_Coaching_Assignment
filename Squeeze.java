public class Squeeze {
   public static String squeeze(String s) {
      StringBuilder squeezed = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);
         if (ch != ' ') {
            squeezed.append(ch);
         }
      }
      return squeezed.toString();
   }

   public static void main(String... args) {
      String s3 = squeeze("This is AppSquadz Instiute");
      System.out.println(s3);
   }

}
