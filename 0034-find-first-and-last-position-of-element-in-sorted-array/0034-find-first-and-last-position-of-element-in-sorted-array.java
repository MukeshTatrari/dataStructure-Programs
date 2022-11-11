class Solution {

    public int[] searchRange(int[] nums, int target) {
        List<Integer> ls = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ls.add(i);
            }
        }
        if (ls.isEmpty()) {
            return new int[] { -1, -1 };
        } else if (ls.size() == 1) {
            return new int[] { ls.get(0), ls.get(0) };
        } else {
            int arr[] = new int[2];
            arr[0] = ls.get(0);
            arr[1] = ls.get(ls.size() - 1);
            return arr;
        }
    }
}
