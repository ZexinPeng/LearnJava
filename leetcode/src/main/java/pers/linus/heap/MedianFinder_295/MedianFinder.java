package pers.linus.heap.MedianFinder_295;

import java.util.PriorityQueue;

class MedianFinder {
    private PriorityQueue<Integer> small;
    private PriorityQueue<Integer> big;
    public MedianFinder() {
        small = new PriorityQueue<Integer>((a,b)->(b - a));
        big = new PriorityQueue();
    }

    public void addNum(int num) {
        if (small.size() > big.size()) {
            big.add(num);
        } else {
            small.add(num);
        }
    }

    public double findMedian() {
        return small.size() > big.size() ? small.peek() : ((double)small.peek() + big.peek()) / 2;
    }
}
