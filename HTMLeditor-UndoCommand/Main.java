package com.katsup7.command.editor;

public class Main {
    public static void main(String[] args) {
        History history = new History();
        HtmlDocument htmlDocument = new HtmlDocument("Hi Jerry");
        System.out.println("Before: " + htmlDocument.getContent());

        var boldCommand = new BoldCommand(htmlDocument, history);
        boldCommand.execute();
        System.out.println("Bold: " + htmlDocument.getContent());

        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println("Undo bold: " + htmlDocument.getContent());
    }
}
