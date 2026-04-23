class Solution {
    public int solve(int[] nums, int i){
        if(i<2) return 0; 

        int res = 0;
       
        if(nums[i-1]-nums[i-2] == nums[i]-nums[i-1]){
            res = 1 + solve(nums, i-1);
        }                  
        return res;
    }
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n<3) return 0;

        int count = 0;
        for(int i=2; i<n; i++){
            count += solve(nums, i); 
        }
        return count; 
    }
}