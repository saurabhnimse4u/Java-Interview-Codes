package Code1;

public class FindCommonElementBetweenTwoStringArray {

	public static void main(String[] args) {

		String[] str1 = { "java", "php", "python" };
		String[] str2 = { "javaScript", "nodejs", "java", "python" };

		for (int i = 0; i < str1.length; i++) {
			for (int j = 0; j < str2.length; j++) {
				if (str1[i].equals(str2[j])) {
					System.out.println(str1[i]);
					break;
				}
			}
		}
	}
}
