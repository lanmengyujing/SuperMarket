package com.thoughtworks.supermarker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InputTest {
    @Test
    public void inputTest() {
        Goods goods1 = new Goods(1, "g1", 1.0);
        Goods goods2 = new Goods(2, "g2", 2.0);
        Goods goods3 = new Goods(3, "ggg", 100);
        InputGoods input = new InputGoods();
        input.set(goods1);
        input.set(goods2);
        input.set(goods3);
        input.set(goods1);
        assertEquals(2, input.get(goods1));
        assertEquals(1, input.get(goods2));
    }
}
