package com.katsup.memento;

public class DocumentMemento {
    private final String content;
    private final String font;
    private final int fontSize;

    public DocumentMemento(String content, String font, int fontSize){
        this.content = content;
        this.font = font;
        this.fontSize = fontSize;
    }

    public String getContent(){
        return content;
    }
    public String getFont(){
        return font;
    }
    public int getFontSize(){
        return fontSize;
    }
}
