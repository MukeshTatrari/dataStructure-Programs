class Solution {

    public int searchInsert(int[] nums, int target) {
        int value = 0;
        int data = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                value = i;
                break;
            } else {
                if (nums[i] < target) {
                    data = i + 1;
                }
            }
        }
        if (value != 0) {
            return value;
        } else {
            return data;
        }
    }
}
