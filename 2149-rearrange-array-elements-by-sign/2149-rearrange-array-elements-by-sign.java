class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];  //Empty Array
        // Using Two pointers
        int positive = 0;  // 0th index of empty array because first element must be positive
        int negative = 1;  // 1st index of empty array

        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                result[positive] = nums[i];
                positive += 2;
            }
            else{
                result[negative] = nums[i];
                negative += 2;
            }
        }
        return result;
    }
}