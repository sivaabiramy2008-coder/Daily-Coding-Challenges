import java.util.*;

class Solution {
    public List<String> commonChars(String[] words) {

        int[] minCount = new int[26];

        // Count characters in the first word
        for (char c : words[0].toCharArray()) {
            minCount[c - 'a']++;
        }

        // Compare with remaining words
        for (int i = 1; i < words.length; i++) {

            int[] currentCount = new int[26];

            for (char c : words[i].toCharArray()) {
                currentCount[c - 'a']++;
            }

            // Keep minimum frequency
            for (int j = 0; j < 26; j++) {
                minCount[j] = Math.min(minCount[j], currentCount[j]);
            }
        }
        // Create result
        List<String> result = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            while (minCount[i] > 0) {
                result.add(String.valueOf((char) ('a' + i)));
                minCount[i]--;
            }
        }
        return result;
    }
}
