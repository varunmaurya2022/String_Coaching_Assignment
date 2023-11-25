public class StringLength {
	public static int length(String s) {
		System.out.print("String :" + s);
		int len = 0;

		for (char c : s.toCharArray()) {
			len += 1;
		}
		return len;
	}

	public static void main(String... args) {
		int l = length("This is a string");
		System.out.println("");
		System.out.println("Total Length " + l);
	}
}