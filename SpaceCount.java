public class SpaceCount {
   public static int spaceCount(String s) {
      int count = 0;
      System.out.print("String is :" + s);
      System.out.println("");
      for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);
         if (ch == ' ') {
            count += 1;
         }
      }
      return count;
   }

   public static void main(String... args) {
      int c = spaceCount("this is a AppSquadz Coaching center and this is a best institute of Delhi.");
      System.out.print("Total Space is " + c);
   }
}