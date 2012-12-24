package com.thoughtworks.supermarker;

public class Goods {

    private int id;
    private String name;
    private double price;

    public Goods(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        Goods goods = (Goods) obj;
        if (this.id == goods.id) {
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
