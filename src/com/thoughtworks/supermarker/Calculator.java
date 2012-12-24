package com.thoughtworks.supermarker;

import java.util.HashMap;

public class Calculator {
    private double result;
    private HashMap<Goods, Integer> map;

    public Calculator(HashMap<Goods, Integer> list) {
        this.map = list;
        calculate();
    }

    private void calculate() {
        result = 0;
        for (Goods g : map.keySet()) {
            result += g.getPrice();
        }
    }

    public double getResult() {
        return result;
    }
}
