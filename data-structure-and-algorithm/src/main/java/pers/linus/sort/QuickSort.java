package pers.linus.sort;

public class QuickSort implements Sort{
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int l = left;
        int r = right;
        int pivot = left;
        while (l < r) {
            if (nums[r] < nums[pivot]) {
                swap(nums, pivot, r);
                pivot = r;
                while (l < r) {
                    if (nums[l] > nums[pivot]) {
                        swap(nums, pivot, l);
                        pivot = l;
                        break;
                    }
                    l++;
                }
            }
            r--;
        }
        quickSort(nums, left, l - 1);
        quickSort(nums, l + 1, right);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
