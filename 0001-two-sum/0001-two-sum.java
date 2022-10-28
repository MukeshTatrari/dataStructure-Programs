class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[] {i,map.get(diff)};
            }else{
                map.put(nums[i], i);
            }
        }
         return new int[] {0,0};
    }
    
}