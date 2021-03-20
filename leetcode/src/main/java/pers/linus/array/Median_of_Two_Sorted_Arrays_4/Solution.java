package pers.linus.array.Median_of_Two_Sorted_Arrays_4;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int curr1 = 0;
        int curr2 = 0;
        int currArr = 0;
        for (; currArr < arr.length; currArr++) {
            if (curr1 == nums1.length || curr2 == nums2.length) {
                break;
            }
            if (nums1[curr1] <= nums2[curr2]) {
                arr[currArr] = nums1[curr1];
                curr1++;
            }
            else {
                arr[currArr] = nums2[curr2];
                curr2++;
            }
        }
        if (curr1 == nums1.length) {
            for (int i = curr2; i < nums2.length; i++) {
                arr[currArr++] = nums2[i];
            }
        }
        if (curr2 == nums2.length) {
            for (int i = curr1; i < nums1.length; i++) {
                arr[currArr++] = nums1[i];
            }
        }
        return ((double)arr[(arr.length - 1) / 2] + (double)arr[arr.length / 2]) / 2;
    }
}
