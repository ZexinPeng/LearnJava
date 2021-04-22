package pers.linus.production_and_consumer;

import java.util.LinkedList;
import java.util.List;

public class Consumer extends Thread{
    private LinkedList<Integer> list;

    public Consumer(LinkedList<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                consume();
                list.notify();
            }
        }
    }

    private void consume() {
        if (list.size() == 0) {
            return;
        }
        System.out.println("consume " + list.poll() + " in the queue.");
    }
}
