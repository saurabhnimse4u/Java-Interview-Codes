package Code1;

public class FindLongestWordFromSentence {

	public static void main(String[] args) {

		String str = "Saurabh Nimse is a good man";

		String[] strSplit = str.split(" ");

		String longest = " ";
		for (int i = 0; i < strSplit.length; i++) {
			if (strSplit[i].length() > longest.length()) {
				longest = strSplit[i];
			}
		}
		System.out.println(longest);
		System.out.println(longest.length());
	}

}
