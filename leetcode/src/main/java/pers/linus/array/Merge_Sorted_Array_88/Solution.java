package pers.linus.array.Merge_Sorted_Array_88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int tmp = m;
        int cur2 = 0;
        for (int i = 0; i < m && cur2 < n ; i++) {
            if (nums2[cur2] < nums1[i]) {
                for (int j = m; j > i; j--) {
                    nums1[j] = nums1[j - 1];
                }
                nums1[i] = nums2[cur2++];
                m++;
            }
        }
        if (cur2 != n) {
            for (int i = m; i < tmp + n; i++) {
                nums1[i] = nums2[cur2++];
            }
        }
    }
}
