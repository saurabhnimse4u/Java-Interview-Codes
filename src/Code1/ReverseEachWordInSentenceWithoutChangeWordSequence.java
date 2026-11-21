package Code1;

public class ReverseEachWordInSentenceWithoutChangeWordSequence {

	public static void main(String[] args) {

		String sentence = "Saurabh Automation Tester";
		String[] words = sentence.split(" ");

		for (int i = 0; i <= words.length - 1; i++) {
			String revString = " ";

			for (int j = words[i].length() - 1; j >= 0; j--) {
				revString = revString + words[i].charAt(j);
			}
			System.out.print(revString);
		 }

		System.out.println(" ");
		for (int k = words.length - 1; k >= 0; k--) {
		System.out.print(words[k]+" ");
		}
	}

}
