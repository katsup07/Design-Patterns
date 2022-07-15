package com.katsup7.Iterator;

public class ArrayIterator implements Iterator{
    private String[] urls;
    private int count;

    public ArrayIterator(String[] urlsArray){
        this.urls = urlsArray;
    }
    @Override
    public boolean hasNext() {
        return count < urls.length && urls[count] != null;
    }

    @Override
    public String getNext() {
        return urls[count];
    }

    public void next(){
        count++;
    }
}
