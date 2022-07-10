package com.katsup.memento;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class History {
    private Deque<DocumentMemento> documentMementos = new ArrayDeque<>();

    public void push(DocumentMemento memento){
        documentMementos.push(memento);
    }

    public DocumentMemento pop(){
        return documentMementos.pop();
    }
}
