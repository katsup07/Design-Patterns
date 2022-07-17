package com.katsup7.command.editor;

public class UndoCommand implements Command{
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    public void execute() {
        if (history.size() > 0) {
            UndoableCommand lastCommand = history.pop();
            lastCommand.unexecute();
            System.out.println("Undoing last action...");
        }
    }


}
