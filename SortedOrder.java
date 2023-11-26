public class SortedOrder {
   public static void sortedOrder(String s) {
      char[] ch = s.toCharArray();
      for (int i = 0; i < ch.length - 1; i++) {
         for (int j = 0; j < ch.length - i - 1; j++) {
            if (ch[j] > ch[j + 1]) {
               char temp = ch[j];
               ch[j] = ch[j + 1];
               ch[j + 1] = temp;
            }
         }
      }
      for (char c : ch) {
         System.out.print(c);
      }
   }

   public static void main(String... args) {
      sortedOrder("india");
   }
}
