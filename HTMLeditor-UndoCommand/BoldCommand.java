package com.katsup7.command.editor;

public class BoldCommand implements UndoableCommand {
    private HtmlDocument document;
    private History history;
    private String prevContent;

    public BoldCommand(HtmlDocument document, History history) {
        this.document = document;
        this.history = history;
    }


    @Override
    public void unexecute() {
        document.setContent(prevContent);
    }

    @Override
    public void execute() {
        prevContent = document.getContent();
        document.makeBold();
        history.push(this);
    }
}
