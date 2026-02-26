class Solution {
    public int longestPalindromeSubseq(String s) {
int[][]arr=new int[s.length()][s.length()];
        for(int[]row:arr) Arrays.fill(row,-1);
        return helper(s,new StringBuilder(s).reverse().toString(),s.length()-1,s.length()-1,arr);
    }
    public static int helper(String text1,String text2,int index1,int index2,int[][]dp){
        if(index1<0||index2<0)return 0;
        if(dp[index1][index2]!=-1)return dp[index1][index2];
        if(text1.charAt(index1)==text2.charAt(index2))return 1+helper(text1,text2,index1-1,index2-1,dp);
        return dp[index1][index2]=Math.max(helper(text1,text2,index1-1,index2,dp),helper(text1,text2,index1,index2-1,dp));
    }
}