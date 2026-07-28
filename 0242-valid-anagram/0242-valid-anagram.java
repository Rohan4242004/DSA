class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: Early exit if lengths do not match
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Initialize a frequency array for the 26 lowercase letters
        int[] counts = new int[26];

        // Step 3: Increment for characters in s, decrement for characters in t
        for (int i = 0; i < s.length(); i++) {
            counts[s.charAt(i) - 'a']++;
            counts[t.charAt(i) - 'a']--;
        }

        // Step 4: If all counts return to 0, the strings are valid anagrams
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}