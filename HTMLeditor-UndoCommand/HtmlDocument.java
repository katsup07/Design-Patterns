package com.katsup7.command.editor;

public class HtmlDocument {
    private String content;

    public HtmlDocument(String content) {
        this.content = content;
    }

    public void makeBold(){
        System.out.println("Making content bold");
        content = "<b>" + content + "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
