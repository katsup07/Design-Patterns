package com.katsup.command;

import com.katsup.command.fx.Command;

public class ResizeCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Resizing...");
    }
}
