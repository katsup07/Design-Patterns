package com.katsup.template;

// Type A executes code both before and after
public class TypeAWindow extends Window{
    @Override
    protected void executeBefore() {
        System.out.println("Type A Window - Executing some code before...");
    }

    @Override
    protected void executeAfter() {
        System.out.println("Type A Window - Executing some code after...");
    }

}
