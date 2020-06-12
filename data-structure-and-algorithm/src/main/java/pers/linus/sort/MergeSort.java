package pers.linus.sort;

public class MergeSort implements Sort{
    public void sort(int[] arr) {
        int[] tmpArr = new int[arr.length];
        mergeSort(arr, tmpArr, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int[] tmpArr, int first, int end) {
        if (first < end) {
            int mid = (first + end) / 2;
            mergeSort(arr, tmpArr, first, mid);
            mergeSort(arr, tmpArr, mid + 1, end);
            merge(arr, tmpArr, first, end);
        }
    }

    private void merge(int[] arr, int[] tmpArr, int first, int end) {
        int mid = (first + end) / 2;
        int arr1Current = first;
        int arr2Current = mid + 1;
        int tmpCurrent = first;
        while (arr1Current <= mid && arr2Current<= end) {
            if (arr[arr1Current] <= arr[arr2Current]) {
                tmpArr[tmpCurrent++] = arr[arr1Current++];
            }
            else {
                tmpArr[tmpCurrent++] = arr[arr2Current++];
            }
        }
        while (arr1Current <= mid) {
            tmpArr[tmpCurrent++] = arr[arr1Current++];
        }
        while (arr2Current <= end) {
            tmpArr[tmpCurrent++] = arr[arr2Current++];
        }
        for (int i = first; i <= end; i++) {
            arr[i] = tmpArr[i];
        }
    }
}
