class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for(int i=0; i<nums.length; i++){
            int sum = 0; /// Hamne sum=0 loop ke andar isliye liya hai taki sum wapas se 0 ho jaye, jab hame j wale loop se bahar aa jaye tab
            
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
            if(sum == k){
            count++;
            }
            }
        }
        return count;
    }
}