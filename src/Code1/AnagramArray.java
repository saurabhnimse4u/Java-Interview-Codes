package Code1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramArray {

	public static void main(String[] args) {

		String[] strArray = { "eat", "ate", "bat", "tab", "cab", "sab", "abs" };

		Map<String, List<String>> map = new HashMap<>();

		for (String str : strArray) {

			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);
			map.putIfAbsent(key, new ArrayList<>());
			map.get(key).add(str);

		}

		System.out.println(map);

	}

}
