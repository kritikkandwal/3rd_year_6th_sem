class Solution {
    public int majorityElement(int[] nums) {
        int find=nums.length/2;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);

            if(map.get(num)>find){
                return num;
            }
        }
        return -1;



    }


}