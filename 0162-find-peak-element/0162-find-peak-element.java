class Solution {

    public int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1] && nums[i] > nums[i - 1]) {
                return i;
            }else if(i+1==nums.length-1 && nums[i] < nums[i + 1] ){
                return i+1;
            }
        }
        if (nums.length == 2 && nums[0] < nums[1]) {
            return 1;
        }
        return 0;
    }
}
