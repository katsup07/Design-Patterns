package com.katsup.memento;

public class Document {
    private String content;
    private String font; // font name
    private int fontSize;
    
    public DocumentMemento createDocumentMemento(){
        return new DocumentMemento(content, font, fontSize);
    }

    public void restore(DocumentMemento memento){
        this.content = memento.getContent();
        this.font = memento.getFont();
        this.fontSize = memento.getFontSize();
    }
    
    // Content
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // Font Name
    public String getFont() {
        return font;
    }

    public void setFont(String fontName) {
        this.font = fontName;
    }

    // Font Size
    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + font + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
