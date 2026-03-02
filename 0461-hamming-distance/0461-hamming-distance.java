class Solution {
    public int hammingDistance(int x, int y) {
        int differenceMap = x ^ y;
        
        int distance = 0;
        while (differenceMap != 0) {
            distance += (differenceMap & 1);
            differenceMap = differenceMap >>> 1;
        }
        return distance;  
    }
}