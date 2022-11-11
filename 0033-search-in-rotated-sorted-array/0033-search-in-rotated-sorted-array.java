class Solution {

    public int search(int[] nums, int target) {
        int index;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                index = i;
                return index;
            }
        }

        return -1;
    }
}
