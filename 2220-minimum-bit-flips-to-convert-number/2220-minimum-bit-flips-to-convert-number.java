class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;  // 10^7 = 1101   Which means 3 bit flip hoga
        // Each 1 means: "This bit is different, so it must be flipped."

        int count = 0;

        while (xor != 0) {
            xor = xor & (xor - 1);  // IN every iteration one 1 will disappear 
            count++;
        }

        return count;
    }
}