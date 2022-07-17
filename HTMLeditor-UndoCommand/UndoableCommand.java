package com.katsup7.command.editor;

public interface UndoableCommand extends Command {
    void unexecute();
}
