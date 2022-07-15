package com.katsup7.Iterator;

// Can switch between different types of iterators easily,
// by just changing BrowseHistory and using an appropriate iterator class.
public class BrowseHistory {
    private String[] urls = new String[10];
    private int index = 0;

    public void push(String url){
        urls[index++] = url;
    }

    public String pop(){
        return urls[--index];
    }

    public Iterator createIterator(){
        return new ArrayIterator(urls);
    }

//    public class ListIterator implements Iterator {
//
//    }
}
