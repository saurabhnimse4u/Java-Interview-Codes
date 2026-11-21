package Code1;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindFirstNonRepetingCharFromString {

	public static void main(String[] args) {

		String str = "isawissssiii";

		Map<Character, Integer> map = new LinkedHashMap<>();
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() >= 1) {
				System.out.println("First non repeting char: " + entry.getKey());
				break;
			}

		}
	}

}
