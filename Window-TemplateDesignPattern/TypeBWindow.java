package com.katsup.template;

// Type B only executes code after
public class TypeBWindow extends Window{

    @Override
    protected void executeAfter() {
        System.out.println("Type B Window - Executing some code after...");
    }

}
