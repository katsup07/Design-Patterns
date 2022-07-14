package com.katsup.visitor;

public class PlainTextOperation implements Operation{

    @Override
    public void apply(HeadingNode heading) {
        System.out.println("Making heading plain text...");
    }

    @Override
    public void apply(AnchorNode anchor) {
        System.out.println("Making anchor plain text...");
    }
}
