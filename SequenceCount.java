public class SequenceCount {
   public static void sequenceCount(String s) {
      String s1 = s.toLowerCase();
      System.out.println("String : " + s1);
      System.out.println("Character    Frequency");
      for (char ch = 'a'; ch <= 'z'; ch++) {
         int count = 0;
         for (int i = 0; i < s1.length(); i++) {
            if (ch == s1.charAt(i))
               count += 1;

         }
         if (count != 0) {
            System.out.println(ch + " \t\t " + count);
         }
      }
   }

   public static void main(String... args) {
      sequenceCount("This is a String");
   }
}