class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Force mid to be even
            if (mid % 2 == 1) {
                mid--;
            }

            // If mid and mid+1 match, the single element is further right
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                // Otherwise, the single element is at mid or to its left
                right = mid;
            }
        }

        return nums[left];
    }
}