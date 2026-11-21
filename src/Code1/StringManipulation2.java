package Code1;

public class StringManipulation2 {

	public static void main(String[] args) {

		String input = "pppqqaaaaappc";
		String result = " ";
		int count = 1;

		for (int i = 1; i < input.length(); i++) {

			if (input.charAt(i) == input.charAt(i - 1)) {
				count++;
			} else {
				result = result + input.charAt(i - 1) + count;
				count = 1;
			}
		}
		result = result + input.charAt(input.length() - 1) + count;
		System.out.println(result);
	}
}
