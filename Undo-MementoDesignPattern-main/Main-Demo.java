package com.katsup.memento;

public class Main {

    public static void main(String[] args) {
	    var doc = new Document();
        var history = new History();
        doc.setContent("Hi there!");
        history.push(doc.createDocumentMemento());
        doc.setContent("Hello there!");
        history.push(doc.createDocumentMemento());
        doc.setFont("Comic Sans");
        history.push(doc.createDocumentMemento());
        doc.setFontSize(1);
        history.push((doc.createDocumentMemento()));
        doc.setContent("Yo yo yo");
        history.push(doc.createDocumentMemento());
        doc.setFontSize(2);
        doc.restore(history.pop());
        // doc.restore(history.pop());
        // doc.restore(history.pop());
        // doc.restore(history.pop());
        // doc.restore(history.pop());

        System.out.println(doc);
        // Think of it like it is a stack.
    } //  (top)  2, "Yo yo yo", 1, "Comic Sans", "Hello There", "Hi There!"  (bottom)
}
