package Code1;

public class CountNoOftimesAlphbateIsComming {

	public static void main(String[] args) {

		String str = "saurabh";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a') {
				count++;
			}
		}

		System.out.println("Number of times a : " +count);
	}

}
