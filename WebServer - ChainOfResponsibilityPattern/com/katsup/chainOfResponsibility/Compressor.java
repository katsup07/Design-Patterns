package com.katsup.chainOfResponsibility;

public class Compressor extends Handler{

    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Compressing...");

        return false;// means not done processing the request. when false, next handler in chain will be called.
    }
}
