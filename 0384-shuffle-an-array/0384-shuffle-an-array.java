class Solution {
    private int[] nums;
    private int[] original;
    private Random rand = new Random();

    public Solution(int[] nums) {
        this.nums = nums;
        this.original = nums.clone();
    }

    public int[] reset() {
        nums = original.clone();  // Reset to the original array
        return nums;
    }

    public int[] shuffle() {
        int[] shuffled = nums.clone();
        for (int i = shuffled.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }
        return shuffled;
    }
}