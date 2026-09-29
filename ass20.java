import java.util.*;

public class AnagramGroups {
    public static void main(String[] args) {

        String[] strings = {
            "eat", "tea", "tan", "ate", "nat", "bat"
        };

        HashMap<String, Integer> map = new HashMap<>();

        // Find the key for each string
        for (String str : strings) {

            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        // Count groups
        int groups = 0;

        for (int count : map.values()) {
            if (count > 1) {
                groups++;
            }
        }

        System.out.println("Number of anagramic groups: " + groups);
    }
}
