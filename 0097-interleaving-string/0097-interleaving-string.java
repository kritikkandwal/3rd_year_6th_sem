class Solution {
    // Boolean[][][] dp;
    public boolean solve(String s1, String s2, int i, int j, String s3, int itr){
        // itr -> current index in s3
        // i -> current index in s1
        // j -> current index in s2

        if(itr>=s3.length()) return true;
        if(i>=s1.length() && j>=s2.length()) return false;

        if(i>=s1.length()){
            String a = s2.substring(j, s2.length());
            String b = s3.substring(itr, s3.length());
            if(a.equals(b)) return true;
            return false;
        }
        if(j>=s2.length()){
            String a = s1.substring(i, s1.length());
            String b = s3.substring(itr, s3.length());
            if(a.equals(b)) return true;
            return false;
        }

        // if(dp[i][j][itr]!=null) return dp[i][j][itr];

        boolean res = false;
        int itr1 = itr;
        int k = i;

        // try taking a chunk from s1
        while(k<s1.length() && s3.charAt(itr1)==s1.charAt(k)){
            
            int itr2 = itr1+1;
            int l=j;

            // after taking chunk from s1, try chunk from s2
            while(l<s2.length() && s3.charAt(itr2)==s2.charAt(l)){
                res |= solve(s1, s2, k+1, l+1, s3, itr2+1);
                if(res){
                    // dp[i][j][itr] = res;
                    return true;
                }
                itr2++;
                l++;
            }

            itr1++;
            k++;
        }

        // dp[i][j][itr] = res;
        return res;
    }

    Boolean[][] dp;
    public boolean solve2(String s1, String s2, String s3, int i, int j){
        // i+j is the current index in s3

        if(i+j>=s3.length()) return true;
        if(i>=s1.length() && j>=s2.length()) return false;

        if(i>=s1.length()){
            String a = s2.substring(j, s2.length());
            String b = s3.substring(i+j, s3.length());
            if(a.equals(b)) return true;
            return false;
        }
        if(j>=s2.length()){
            String a = s1.substring(i, s1.length());
            String b = s3.substring(i+j, s3.length());
            if(a.equals(b)) return true;
            return false;
        }

        if(dp[i][j]!=null) return dp[i][j];

        boolean res = false;

        // take from s1 if it matches current char in s3
        if(s3.charAt(i+j)==s1.charAt(i)){
            res |= solve2(s1, s2, s3, i+1, j);
        }

        // take from s2 if it matches current char in s3
        if(res) dp[i][j] = res;
        if(s3.charAt(i+j)==s2.charAt(j)){
            res |= solve2(s1, s2, s3, i, j+1);
        }
        dp[i][j] = res;
        return res;
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        if((s1.length() + s2.length()) != s3.length()) return false;

        // Approach - 1 (Partition)
        // dp = new Boolean[s1.length()][s2.length()][s3.length()];
        // boolean ans1 = solve(s1, s2, 0, 0, s3, 0);
        // dp = new Boolean[s2.length()][s1.length()][s3.length()];
        // boolean ans2 = solve(s2, s1, 0, 0, s3, 0);
        // // System.out.println(Arrays.deepToString(dp2));
        // return ans1 || ans2;
        
        // Approach - 2 (Optimal)
        dp = new Boolean[s1.length()][s2.length()];
        return solve2(s1, s2, s3, 0, 0);
    }
}