package pers.linus.production_and_consumer;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Producter producter = new Producter(list);
        Consumer consumer = new Consumer(list);
        producter.start();
        consumer.start();
    }
}
