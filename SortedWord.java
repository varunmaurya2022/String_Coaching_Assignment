public class SortedWord {
   public static String[] sortedWord(String[] s) {
      int n = s.length;
      String temp;

      for (int i = 0; i < n - 1; i++) {
         for (int j = 0; j < n - i - 1; j++) {
            // Comparing adjacent strings and swapping if necessary
            if (s[j].compareTo(s[j + 1]) > 0) {
               temp = s[j];
               s[j] = s[j + 1];
               s[j + 1] = temp;
            }
         }
      }
      return s;
   }

   public static void main(String[] args) {
      String[] words = { "orange", "apple", "banana", "grape", "kiwi" };

      System.out.print("Unsorted Words :");
      for (int i = 0; i < words.length; i++)
         System.out.print(words[i] + " ");
      String[] sortedWord = sortedWord(words);

      System.out.println("");
      System.out.print("Sorted words:");
      for (String word : sortedWord) {
         System.out.print(word + " ");
      }
   }
}
