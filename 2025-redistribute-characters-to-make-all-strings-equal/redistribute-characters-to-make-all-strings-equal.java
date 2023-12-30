import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean makeEqual(String[] words) {
        Map<Character, Integer> charFrequency = new HashMap<>();

        // Count the frequency of each character in all strings
        for (String word : words) {
            for (char c : word.toCharArray()) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }

        // Check if the count of each character is a multiple of the total number of strings
        int totalStrings = words.length;
        for (int count : charFrequency.values()) {
            if (count % totalStrings != 0) {
                return false;
            }
        }

        return true;
    }
}