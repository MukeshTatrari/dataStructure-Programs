class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int arr[] = new int[m + n];
        int m1 = 0;
        int n1 = 0;
        int i = 0;
        while (m1 < m && n1 < n) {
            if (nums1[m1] < nums2[n1]) {
                arr[i] = nums1[m1];
                m1++;
            } else {
                arr[i] = nums2[n1];
                n1++;
            }
            i++;
        }
        while (m1 < m) {
            arr[i] = nums1[m1];
            m1++;
            i++;
        }
        while (n1 < n) {
            arr[i] = nums2[n1];
            n1++;
            i++;
        }
        int p = arr.length;
        int x = p / 2;

        if(p%2==0){
            x = x-1;
            int x1 = arr[x];
            int x2 = arr[x + 1];
            double p1 = (double)(x1+x2)/2;
            return p1;
        }else{

            return arr[x];
        }
        
    }
}