class Solution {
    public int missingNumber(int[] nums) {
        int sum =0;
        for(int i = 0; i<nums.length; i++){
            sum=sum+nums[i];  // sum of element in given array
        }
        int actualSum = (nums.length*(nums.length+1))/2;   // It is the sum when number is not missing
        int missingNum = actualSum - sum;
        // Example : 3+0+1 = 4    sum
                 //  0+1+2+3 = 6  actual sum = (n*(n+1)/2)
                // Therefore missing number = 6-4=2
        return missingNum;
    }
}