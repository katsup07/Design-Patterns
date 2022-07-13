package com.katsup.mediator;

public class ListBox extends UIControl {
    private String selection;

    public ListBox(DialogBox dialogBox) {
        super(dialogBox);
    }

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        dialogBox.changed(this);
    }

}
