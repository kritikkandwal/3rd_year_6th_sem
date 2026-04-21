/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public int helper(TreeNode root, HashMap<Integer,Integer> freq){

        if(root.left==null && root.right==null){
                freq.put(root.val,freq.getOrDefault(root.val,0)+1);
                return root.val;
        }

        int left = root.left!=null?helper(root.left,freq):0;
        int right =root.right!=null?helper(root.right,freq):0;
        
        int sum = left + right + root.val;
        freq.put(sum,freq.getOrDefault(sum,0)+1);
        return sum;

    }

    public int[] findFrequentTreeSum(TreeNode root) {

       HashMap<Integer,Integer> map = new HashMap<>();
       helper(root,map);
       int maxValue = Collections.max(map.values());
       List<Integer> maxFreqItems = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == maxValue)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
int[] resultArray = maxFreqItems.stream().mapToInt(Integer::intValue).toArray();


       return resultArray;
    }
}