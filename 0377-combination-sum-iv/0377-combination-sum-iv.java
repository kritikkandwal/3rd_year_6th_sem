class Solution {
    public int combinationSum4(int[] nums, int target) {
        Integer[] memo = new Integer[target + 1];
        return helper(nums, target, memo);
    }

    int helper(int[] nums, int target, Integer[] memo) {
        if (target == 0) return 1;
        if (target < 0) return 0;  
        if (memo[target] != null) return memo[target]; 

        int count = 0;
        for (int num : nums) {
            count += helper(nums, target - num, memo); 
        }
        memo[target] = count; 
        return count;
    }
}