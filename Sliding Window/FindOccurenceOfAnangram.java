
import java.util.*;

public class FindOccurenceOfAnangram {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int k = p.length();
        int n = s.length();
        if (n < k) {
            return ans;  // Edge case: If s is shorter than p, return empty list
        }
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Populate frequency map for string 'p'
        for (char ch : p.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int count = map.size();  // Unique characters count
        int i = 0, j = 0;

        // Step 2: Start sliding window
        while (j < n) {
            // Calculation: Reduce count for current character
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) - 1);
                if (map.get(ch) == 0) {
                    count--;  // If frequency reaches 0, reduce distinct count

                }
            }

            // If window size is less than k, expand
            if (j - i + 1 < k) {
                j++;
            } // If window size is exactly k
            else if (j - i + 1 == k) {
                if (count == 0) {
                    ans.add(i);  // Store the starting index of anagram
                }

                // Slide window: Remove the leftmost character
                char ch1 = s.charAt(i);
                if (map.containsKey(ch1)) {
                    map.put(ch1, map.get(ch1) + 1);
                    if (map.get(ch1) == 1) {
                        count++;  // If frequency becomes 1, increase count

                    }
                }

                // Move the window
                i++;
                j++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        FindOccurenceOfAnangram obj = new FindOccurenceOfAnangram();
        System.out.println(obj.findAnagrams("cbaebabacd", "abc")); // Output: [0, 6]
        System.out.println(obj.findAnagrams("abab", "ab"));        // Output: [0, 1, 2]
    }
}
