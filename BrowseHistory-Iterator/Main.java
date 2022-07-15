package com.katsup7.Iterator;

public class Main {
    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");
        Iterator iterator = history.createIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.getNext());
            iterator.next();
        }

    }
}