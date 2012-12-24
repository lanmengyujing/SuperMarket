package com.thoughtworks.supermarker;

import java.util.HashMap;

public class InputGoods {
    HashMap<Goods, Integer> map = new HashMap<Goods, Integer>();

    public void set(Goods goods) {
        if(map.containsKey(goods)) {
            map.put(goods, map.get(goods) + 1);
        }
        else
            map.put(goods, 1);
    }

    public int get(Goods goods) {
        return map.get(goods);
    }

    public HashMap<Goods,Integer> getMap(){
        return map;
    }

}
