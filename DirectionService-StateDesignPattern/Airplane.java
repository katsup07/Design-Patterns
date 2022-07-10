package com.katsup.state

public class Airplane implements TravelMethod{
    @Override
    public Object getETA() {
        System.out.println("Calculating ETA (Airplane)");
        return 3;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (Airplane)");
        return "c";
    }
}
