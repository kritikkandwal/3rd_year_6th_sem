class Solution {
    public int countPartitions(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length-1;i++){
            int left=0;
            int right=0;
            for(int j=0;j<=i;j++){
                left=left+nums[j];
            }

            for(int j=i+1;j<nums.length;j++){
                right=right+nums[j];
            }
            int total=left-right;
            if(total%2==0){
                count++;
            }
        }
        return count;
    }
}