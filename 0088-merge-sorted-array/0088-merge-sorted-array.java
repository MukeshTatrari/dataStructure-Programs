class Solution {

    public void merge(int[] arr, int m, int[] arr1, int n) {
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (arr[i] < arr1[j]) {
                merged[k] = arr[i];
                i++;
            } else {
                merged[k] = arr1[j];
                j++;
            }
            k++;
        }
        while (i < m) {
            merged[k] = arr[i];
            i++;
            k++;
        }
        while (j < n) {
            merged[k] = arr1[j];
            j++;
            k++;
        }

        for (int p = 0; p < merged.length; p++) {
            arr[p] = merged[p];
        }
    }
}
