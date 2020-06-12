package pers.linus.sort;

public class InsertionSortArray implements Sort{
    public void sort(int[] arr) {
        int start = 0, end, tmp;
        for (int i = 1; i < arr.length; i++) {
            end = i;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[end]) {
                    tmp = arr[end];
                    for (int k = end; k > j; k--) {
                        arr[k] = arr[k - 1];
                    }
                    arr[j] = tmp;
                    break;
                }
            }
        }
    }
}
