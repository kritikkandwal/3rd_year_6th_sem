class Solution {
    public int minOperations(int[] nums) {
        int moves=0;
        for(int i=1;i<nums.length;i++){
            while(nums[i]<=nums[i-1]){
                nums[i]=nums[i]+1;
                moves++;
            }

        }
        return moves;
    }
}