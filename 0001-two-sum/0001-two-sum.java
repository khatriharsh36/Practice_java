class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> maps=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(maps.containsKey(val)){
                return new int[]{maps.get(val),i};
            }
            maps.put(nums[i],i);
        }
        return new int[]{};
    }
}