import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            for (int x = nums[i - 1] + 1; x < nums[i]; x++) {
                result.add(x);
            }
        }

        return result;
    }
}
