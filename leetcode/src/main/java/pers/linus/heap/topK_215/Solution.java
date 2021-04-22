package pers.linus.heap.topK_215;

public class Solution {
    // heap with the largest number at the top
    public int findKthLargest(int[] nums, int k) {
        int[] heap = new int[nums.length];
        // step 1 : construct the heap
        for (int i = 0; i < nums.length; i++) {
            constructHeap(heap, nums[i], i);
        }
        return getTopK(heap, k);
    }

    private int getTopK(int[] heap, int k) {
        int res = heap[0];
        for (int i = 0; i < k; i++) {
            res = heap[0];
            heap[0] = heap[heap.length - 1 - i];
            int cur = 0;
            int leftChild = cur * 2 + 1;
            int rightChild = cur * 2 + 2;
            while (rightChild <= heap.length - 1 - i) {
                if (rightChild == heap.length - 1 - i) {
                    if (heap[cur] < heap[leftChild]) {
                        swap(heap, cur, leftChild);
                        break;
                    }
                }
                if (heap[cur] >= Math.max(heap[leftChild], heap[rightChild])) {
                    break;
                }
                if (heap[leftChild] < heap[rightChild]) {
                    swap(heap, cur, rightChild);
                    cur = rightChild;
                }
                else {
                    swap(heap, cur, leftChild);
                    cur = leftChild;
                }
                leftChild = cur * 2 + 1;
                rightChild = cur * 2 + 2;
            }
        }
        return res;
    }

    private void constructHeap(int[] heap, int num, int index) {
        heap[index] = num;
        int cur = index;
        int father = (cur - 1) / 2;
        while (cur > 0) {
            if (heap[father] < heap[cur]) {
                swap(heap, father, cur);
                cur = father;
                father = (cur - 1) / 2;
            }
            else {
                break;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
