import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement)) {
                // Found the pair
                return new int[]{map.get(complement), i};
            }
            
            map.put(nums[i], i); // Store number with its index
        }
        
        return new int[]{-1, -1}; // No valid pair found
    }
}
