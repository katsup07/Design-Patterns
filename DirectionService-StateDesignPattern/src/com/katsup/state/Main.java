package com.katsup.state;

public class Main {

  public static void main(String[] args) {
    var ds = new DirectionService();
    ds.setTravelMethod(new Train());
    System.out.println(ds.getETA());
    System.out.println(ds.getDirection());
  }
}
