class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int n1 = m;                 // Find sizes of two subarrays to be merged
        int n2 = n;
        int L[] = new int[n1];              /* Create temp arrays */
        int R[] = new int[n2];
        for (int i = 0; i < n1; ++i)        /*Copy data to temp arrays*/
            L[i] = nums1[i];
        for (int j = 0; j < n2; ++j)
            R[j] = nums2[j];
        /* Merge the temp arrays */
        int i = 0, j = 0;                   // Initial indexes of first and second subarrays
        int k = 0;                          // Initial index of merged subarray array
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                nums1[k] = L[i];
                i++;
            }
            else {
                nums1[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {                    /* Copy remaining elements of L[] if any */
            nums1[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {                    /* Copy remaining elements of R[] if any */
            nums1[k] = R[j];
            j++;
            k++;
        }
    }
}