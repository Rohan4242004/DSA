
class Solution {
    public String compressedString(String word) {
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {

            // Start counting the current character from 1
            int count = 1;

            // Count consecutive occurrences of the same character
            // i < word.length() - 1 ensures i + 1 is within bounds
            // count < 9 limits each group to a maximum of 9 characters
            while (i < word.length() - 1
                    && word.charAt(i) == word.charAt(i + 1)
                    && count < 9) {

                count++; // Increase the count of the current character
                i++;     // Move to the next matching character
            }
            newStr.append(count);
            newStr.append(word.charAt(i));
        }

        // Convert StringBuilder into a String
        return newStr.toString();
    }
}
