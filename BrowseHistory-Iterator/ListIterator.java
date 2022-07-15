package com.katsup7.Iterator;

import java.util.List;

public class ListIterator implements Iterator{
    private List<String> urls;
    private int count = 0;

    public ListIterator(List<String> urlsList){
        this.urls = urlsList;
    }

    @Override
    public boolean hasNext() {
        return count < urls.size();
    }

    @Override
    public String getNext() {
        return urls.get(count);
    }

    public void next(){
        count++;
    }


}
