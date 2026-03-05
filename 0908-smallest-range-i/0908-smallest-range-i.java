class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int mink=Integer.MAX_VALUE;
        int maxk=Integer.MIN_VALUE;
         

        int minnums=Integer.MAX_VALUE;
        int maxnums=Integer.MIN_VALUE;

        for(int i=-k; i<=k; i++){
            if(i<mink){
                mink=i;
            }
            if(i>maxk){
                maxk=i;
            }

        }

        for(int j=0; j<nums.length; j++){
            if(nums[j]<minnums){
                minnums=nums[j];
            }
            if(nums[j]>maxnums){
                maxnums=nums[j];
            }

        }

        int ansmin=minnums+maxk;
        int ansmax=maxnums+mink;

        if (ansmax-ansmin<0){
            return 0;
        }
        return ansmax-ansmin;
    }
}