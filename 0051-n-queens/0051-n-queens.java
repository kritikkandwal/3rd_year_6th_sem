class Solution {
    
    List<List<String>> ans;
    int count[][];

    public List<List<String>> solveNQueens(int n) {
        
        count = new int[n][n];
        ans = new ArrayList<>();

        helper(n,0);

        return ans;
    }

    private void helper(int n,int r){
        if(r == n){
            List<String> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder sb = new StringBuilder();
                for(int j=0;j<n;j++){
                    if(count[i][j] == 0)
                        sb.append("Q");
                    else
                        sb.append(".");
                }
                list.add(sb.toString());
            }
            ans.add(list);
            return;
        }

        for(int c=0;c<n;c++){
            if(count[r][c] == 0){
                modify(n,r,c,1);
                helper(n,r+1);
                modify(n,r,c,-1);
            }
        }
    }

    private void modify(int n,int r,int c,int dif){
        
        for(int i=0;i<n;i++){
            if(i != r)
                count[i][c] += dif;
            if(i != c)
                count[r][i] += dif;    
        }

        int[] dr = {-1, -1, 1, 1};
        int[] dc = {-1,  1, 1, -1};
        
        for (int d = 0; d < 4; d++) {
            int newR = r + dr[d];
            int newC = c + dc[d];
            while (newR >= 0 && newR < n && newC >= 0 && newC < n) {
                count[newR][newC] += dif;
                newR += dr[d];
                newC += dc[d];
            }
        }
        
    }
}