import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);  /// Jab hashmap me kuch nahi tha tab bhi sum 0 tha or uski ferquency 1 thi, means 0 ek bar aya

        int sum = 0;
        int count = 0;

        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) { ///Check karna hai ki, sum -k exist kar raha hai in HashMap
                count += map.get(sum - k); /// Jitni baar bhi sum - k  exist kar raha hoga utni frequency count me add ho jayegi, like sum - k = 10 aya or 10 sum HashMap me 2 baar exist kar raha hai to count me 2 add hoga
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);///simplly sum ki frequence ko increase kar denge by 1, 10 sum phele bhi aya tha or dobara aya to uski fequwncy ko 2 kar denge otherwise 1
        }
        return count;
    }
}