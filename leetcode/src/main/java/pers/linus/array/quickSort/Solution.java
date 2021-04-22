package pers.linus.array.quickSort;

public class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int first, int last) {
        if (first >= last) {
            return;
        }
        int left = first;
        int right = last;
        int pivot = left;
        while (left < right) {
            if (nums[right] < nums[pivot]) {
                swap(nums, pivot, right);
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
