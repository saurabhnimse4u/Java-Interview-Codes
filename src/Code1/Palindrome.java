package Code1;

public class Palindrome {
	
	
	public static void stringPalindrome1(String str) {
		String revStr = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(revStr)) {
			System.out.println("Yes its palindrome: "+revStr);
		}
		else {
			System.out.println("Not palindorme"+revStr);
		}
	}
	
	// without string builder
	

	public static void stringPalindrome2(String str) {		
		String revStr = "";
		for(int i=str.length()-1;i>=0;i--) {	
			revStr = revStr+str.charAt(i);
		}
		if(str.equalsIgnoreCase(revStr)) {
			System.out.println("Yes its palindrome: "+revStr);
		}
		else {
			System.out.println("Not palindorme"+revStr);
		}
	}
	

	public static void main(String[] args) {
		
		stringPalindrome1("madam");
		stringPalindrome2("madam");
	}

}
