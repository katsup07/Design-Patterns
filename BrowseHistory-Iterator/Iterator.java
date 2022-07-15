package com.katsup7.Iterator;

public interface Iterator { // Could use Iterator<T> to be more general instead of using String
    boolean hasNext();
    String getNext();
    void next();
}
