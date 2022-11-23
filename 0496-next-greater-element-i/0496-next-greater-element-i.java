class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int x = getNextGreater(nums1[i],nums2);
            arr[i]=x;
        }
        return arr;
    }

    public int getNextGreater(int n,int[] nums2) {
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == n) {
                for (int j = i; j < nums2.length; j++) {
                    if (nums2[j] > n) {
                        return nums2[j];
                    }
                }
            }
        }
        return -1;
    }
}
