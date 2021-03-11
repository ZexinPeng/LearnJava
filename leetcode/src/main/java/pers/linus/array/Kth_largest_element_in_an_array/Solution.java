package pers.linus.array.Kth_largest_element_in_an_array;

public class Solution {
    // heap with the largest number at the top
    public int findKthLargest(int[] nums, int k) {
        int[] heap = new int[nums.length];
        // construct the heap
        for (int i = 0; i < nums.length; i++) {
            heap[i] = nums[i];
            insertNumber2Heap(heap, nums, i);
        }
        int res = 0;
        for (int i = 0; i < k; i++) {
            res = heap[0];
            heap[0] = heap[heap.length - i - 1];
            refactHeap(heap, heap.length - i - 1);
        }
        return res;
    }

    private void insertNumber2Heap(int[] heap, int[] nums, int index) {
        while (index > 0) {
            int father = (index - 1) / 2;
            if (heap[index] > heap[father]) {
                int tmp = heap[index];
                heap[index] = heap[father];
                heap[father] = tmp;
                index = father;
            }
            else {
                break;
            }
        }
    }

    private void refactHeap(int[] heap, int lastIndex) {
        int current = 0;
        int leftSon = current * 2 + 1;
        int rightSon = (current + 1) * 2;
        while (leftSon <= lastIndex && rightSon <= lastIndex) {
            if (heap[leftSon] > heap[rightSon]) {
                if (heap[current] >= heap[leftSon]) {
                    break;
                }
                int tmp = heap[leftSon];
                heap[leftSon] = heap[current];
                heap[current] = tmp;
                current = leftSon;
            }
            else {
                if (heap[current] >= heap[rightSon]) {
                    break;
                }
                int tmp = heap[rightSon];
                heap[rightSon] = heap[current];
                heap[current] = tmp;
                current = rightSon;
            }
            leftSon = current * 2 + 1;
            rightSon = (current + 1) * 2;
        }

    }
}
