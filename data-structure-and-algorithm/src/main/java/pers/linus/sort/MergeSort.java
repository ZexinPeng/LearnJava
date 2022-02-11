package pers.linus.sort;

public class MergeSort implements Sort{
    public void sort(int[] arr) {
        int[] tmpArr = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1);
    }

    private void mergeSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int mid = left + (right - left) / 2;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        int[] arr = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int index = 0;
        while (i <= mid && j <= right) {
            if (nums[i] < nums[j]) {
                arr[index++] = nums[i++];
            } else {
                arr[index++] = nums[j++];
            }
        }
        while (i <= mid) {
            arr[index++] = nums[i++];
        }
        while (j <= right) {
            arr[index++] = nums[j++];
        }
        for (index = 0; index < arr.length; index++) {
            nums[left + index] = arr[index];
        }
    }
}
