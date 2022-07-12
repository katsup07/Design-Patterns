package com.katsup.command;

import com.katsup.command.fx.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Making black and white...");
    }
}
