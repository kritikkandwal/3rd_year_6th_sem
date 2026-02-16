class Solution {
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums1.length;i++){
            sum1=sum1+nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            sum2=sum2+nums2[j];
        }

        int diff=sum2-sum1;
        int divis=diff/nums1.length;

        return divis;
    }
}