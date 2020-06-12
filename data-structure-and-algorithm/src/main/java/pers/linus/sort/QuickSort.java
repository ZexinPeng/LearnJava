package pers.linus.sort;

public class QuickSort implements Sort{
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int first, int last) {
        if (first >= last) {
            return;
        }

        int base = first;
        int left = first, right = last;
        int tmp;

        while (left < right) {
            if (arr[right] < arr[base]) {
                while (left < right) {
                    if (arr[left] > arr[base]) {
                        tmp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = tmp;
                        break;
                    }
                    else {
                        left++;
                    }
                }
            }
            else {
                right--;
            }
        }
        if (left != base) {
            tmp = arr[base];
            arr[base] = arr[left];
            arr[left] = tmp;
        }
        quickSort(arr, first, left - 1);
        quickSort(arr, left + 1, last);
    }
}
