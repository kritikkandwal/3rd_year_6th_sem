class Solution {
    public int dominantIndex(int[] nums) {
        int max = 0;
        int index = 0;

        // Step 1: find the maximum element and its index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }

        // Step 2: check if max is at least twice every other element
        for (int i = 0; i < nums.length; i++) {
            if (i != index && max < 2 * nums[i]) {
                return -1;
            }
        }

        // Step 3: condition satisfied
        return index;
    }
}
