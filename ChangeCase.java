public class ChangeCase {
   public static String changeCase(String s) { // lowercase 97-122 uppercase 65-90 a=65+32=97=A
      char[] chars = s.toCharArray(); // B=98 lowercase=98-32=66=b
      for (int i = 0; i < chars.length; i++) {
         char currentChar = chars[i];
         if (Character.isLowerCase(currentChar)) {
            chars[i] = (char) (currentChar - 32);
         } else if (Character.isUpperCase(currentChar)) {
            chars[i] = (char) (currentChar + 32);
         }
      }
      return new String(chars);
   }

   public static void main(String[] args) {
      String input = "InDIa";
      String convertedString = changeCase(input);
      System.out.println("Original string: " + input);
      System.out.println("Converted string: " + convertedString);
   }
}
