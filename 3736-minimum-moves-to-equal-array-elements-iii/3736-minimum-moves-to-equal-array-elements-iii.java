class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int move=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++){
            while(nums[i]<nums[n-1]){
                nums[i]=nums[i]+1;
                move++;
            }
        }
        return move;
    }
}