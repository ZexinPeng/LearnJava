package pers.linus.production_and_consumer;

import java.util.List;

public class Producter extends Thread{
    private List<Integer> list;

    public Producter(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        int time = 0;
        while (time < 10) {
            synchronized (list) {
                product(time++);
                list.notify();
            }
        }
    }

    private void product(int production) {
        list.add(production);
        System.out.println("product " + production + " in the queue.");
    }
}
