package pers.linus.array.Sort_an_Array_912;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Solution {
    public int[] sortArray(int[] nums) {
        ConcurrentMap<String, String> map = new ConcurrentHashMap<>();
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int first = left;
        int last = right;

        int pivot = left;
        while (left < right) {
            if (nums[right] < nums[pivot]) {
                swap(nums, right, pivot);
                pivot = right;
                while (left < right) {
                    if (nums[left] > nums[pivot]) {
                        swap(nums, pivot, left);
                        pivot = left;
                        break;
                    }
                    left++;
                }
            }
            right--;
        }
        quickSort(nums, first, pivot - 1);
        quickSort(nums, pivot + 1, last);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
