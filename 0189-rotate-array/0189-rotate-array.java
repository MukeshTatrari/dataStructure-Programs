class Solution {

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] arr = new int[length];
        for (int i = 0; i < nums.length; i++) {
            int d = (i + k) % length;
            arr[d] = nums[i];
        }
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
    }
}
