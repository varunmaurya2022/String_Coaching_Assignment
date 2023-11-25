public class CharCount {
   public static void charCount(String s) {
      int count = 0;
      System.out.print("characters are : ");
      for (int i = 0; i < s.length(); i++) {
         char ch = s.charAt(i);
         if (ch != ' ') {
            count += 1;
            System.out.print(ch + " ");
         }
      }
      System.out.println("");
      System.out.println("Total Character " + count);
   }

   public static void main(String... args) {
      charCount("This is a String Program");
   }

}
