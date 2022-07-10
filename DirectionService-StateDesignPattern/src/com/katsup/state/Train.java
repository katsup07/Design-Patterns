package com.katsup.state;

public class Train implements TravelMethod {
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (Train)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (Train)");
        return "b";
    }
}
