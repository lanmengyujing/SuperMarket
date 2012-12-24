package com.thoughtworks.supermarker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void addGoods() {
        Goods goods1 = new Goods(1, "g1", 1.0);
        Goods goods2 = new Goods(2, "g2", 2.0);
        Goods goods3 = new Goods(3, "ggg", 100);
        HashMap<Goods, Integer> map = new HashMap<Goods, Integer>();
        map.put(goods1, 1);
        map.put(goods2, 1);
        map.put(goods3, 1);

        Calculator calculator = new Calculator(map);
        double result = calculator.getResult();
        assertEquals(103.0, result, 0.1);
    }}
