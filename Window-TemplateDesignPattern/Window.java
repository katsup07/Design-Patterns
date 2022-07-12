package com.katsup.template;

public class Window {
    public void close() {
        executeBefore();

        System.out.println("Removing the window from the screen");

        executeAfter();
        }
    protected void executeBefore(){};// Those classes that need to can override these two methods

    protected void executeAfter(){};
    }
