class Solution {//Tc=o(n) SC=o(1) Optimized Version for space
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        int prev2=nums[0],prev1=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            int curr=Math.max(nums[i]+prev2,prev1);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}