public class StringLength{
	public static void length(String s){
		int len=0;
		
		for (char c:s.toCharArray()){
			len+=1;
		}
		System.out.println("Length of String :"+len);
	}
	public static void main(String... args){
		length("This is a string");
	}
}