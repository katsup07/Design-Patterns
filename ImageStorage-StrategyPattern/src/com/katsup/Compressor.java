package com.katsup.strategy;

public interface Compressor {
    //byte[] compress(byte[] image); // The real way you might do it
    void compress(String fileName);
}