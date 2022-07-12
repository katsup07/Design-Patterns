package com.katsup.observer

import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Stock stock1 = new Stock("A", 1);
        Stock stock2 = new Stock("B", 10);

        StatusBar statusBar = new StatusBar();
        StockListView stockListView = new StockListView();

        statusBar.addStock(stock1);
        statusBar.addStock(stock2);
       stockListView.addStock(stock1);

        stock1.setPrice(2);
       stock2.setPrice(20);


        }


    }
