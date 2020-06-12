package pers.linus.sort;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1 ,2 ,9, 5, 6, 10, 33, 55, 99, 333, 222, 67, 4, 3, 7, 399};
        Sort sort = Stragety.getSort(Stragety.RADIX);
        sort.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
