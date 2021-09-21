package pers.linus.array.Median_of_Two_Sorted_Arrays_4;

public class Solution {
//    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int[] arr = new int[nums1.length + nums2.length];
//        int curr1 = 0;
//        int curr2 = 0;
//        int currArr = 0;
//        for (; currArr < arr.length; currArr++) {
//            if (curr1 == nums1.length || curr2 == nums2.length) {
//                break;
//            }
//            if (nums1[curr1] <= nums2[curr2]) {
//                arr[currArr] = nums1[curr1];
//                curr1++;
//            }
//            else {
//                arr[currArr] = nums2[curr2];
//                curr2++;
//            }
//        }
//        if (curr1 == nums1.length) {
//            for (int i = curr2; i < nums2.length; i++) {
//                arr[currArr++] = nums2[i];
//            }
//        }
//        if (curr2 == nums2.length) {
//            for (int i = curr1; i < nums1.length; i++) {
//                arr[currArr++] = nums1[i];
//            }
//        }
//        return ((double)arr[(arr.length - 1) / 2] + (double)arr[arr.length / 2]) / 2;
//    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int left1 = (nums1.length - 1) / 2;
        int right1 = left1 + 1;
        int left2 = (nums2.length - 1) / 2;
        int right2 = left2 + 1;
        int minRight = Integer.MAX_VALUE;
        int maxLeft = Integer.MIN_VALUE;
        boolean isRight1 = false;
        boolean isLeft1 = false;
        while(true) {
            if (right1 == nums1.length) {
                minRight = nums2[right2];
                isRight1 = false;
            }
            else if (right2 == nums2.length) {
                minRight = nums1[right2];
                isRight1 = true;
            }
            else {
                if (nums1[right1] < nums2[right2]) {
                    minRight = nums1[right1];
                    isRight1 = true;
                }
                else {
                    minRight = nums2[right2];
                    isRight1 = false;
                }
            }
            if (left1 < 0) {
                maxLeft = nums2[left2];
                isLeft1 = false;
            }
            else if (left2 < 0) {
                maxLeft = nums1[left1];
                isLeft1 = true;
            }
            else {
                if (nums1[left1] > nums2[left2]) {
                    maxLeft = nums1[left1];
                    isLeft1 = true;
                }
                else {
                    maxLeft = nums2[left2];
                    isLeft1 = false;
                }
            }
            if (maxLeft <= minRight) {
                break;
            }
            if (isRight1) {
                right1++;
                left1++;
                right2--;
                left2--;
            }
            else {
                right2++;
                left2++;
                right1--;
                left1--;
            }
        };
        if ((nums1.length + nums2.length) % 2 == 0) {
            return ((double)maxLeft + (double)minRight) / 2;
        }
        return maxLeft;
    }
}
