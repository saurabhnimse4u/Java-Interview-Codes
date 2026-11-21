package Code1;

import java.util.Arrays;

public class AnagramTwoStrings {

	public static void main(String[] args) {

		String str1 = "ate";
		String str2 = "tea";

		char input1[] = str1.toCharArray();
		char input2[] = str2.toCharArray();

		Arrays.sort(input1);
		Arrays.sort(input2);
		
		System.out.println(input1);
		System.out.println(input2);

		if (Arrays.equals(input1, input2)) {
			System.out.println("anagram");
		} else {
			System.out.println("not");
		}
	}

}
