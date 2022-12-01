class Solution {

    public boolean isMonotonic(int[] nums) {
        boolean increase = false;
        boolean decrease = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                increase = true;
            }
            if (nums[i] > nums[i + 1]) {
                decrease = true;
            }
        }
        return increase && decrease ? false : true;
    }
}
