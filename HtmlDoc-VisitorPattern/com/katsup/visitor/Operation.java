package com.katsup.visitor;

// Could also call this class Visitor
public interface Operation {
    void apply(HeadingNode heading);
    void apply(AnchorNode anchor);
}
