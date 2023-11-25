public class VowelCount {
	public static int vowelCount(String s) {
		int count = 0;
		System.out.print("vowels are :");
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count += 1;
				System.out.print(ch + " ");
			}
		}
		return count;
	}

	public static void main(String... args) {
		int c = vowelCount("Hello AppSquadz");
		System.out.println("");
		System.out.println("Total vowel is " + c);
	}
}