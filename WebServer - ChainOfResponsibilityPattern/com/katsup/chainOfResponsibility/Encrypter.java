package com.katsup.chainOfResponsibility;

public class Encrypter extends Handler {
    public Encrypter(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Encrypting...");

        return false;
    }
}