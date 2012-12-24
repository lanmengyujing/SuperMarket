package com.thoughtworks.supermarker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class PrintGoods {
    public static void print(InputGoods ig) {
        HashMap<Goods, Integer> map = ig.getMap();
        System.out.println(format());
        for (Goods goods : map.keySet()) {
            System.out.println(format(goods, map.get(goods)));
        }
    }

    private static String format() {
        return  "货号 " + " 商品名称 " + " 单价" + " 数量" ;
    }

    private static String format(Goods goods, int num) {
        return goods.getId() + "  " + goods.getName() + "  " + goods.getPrice() + "  " + num;
    }

    public static void main(String[] args) {
        InputGoods input = new InputGoods();
        ArrayList<Integer> goodsIdList = null;
        try {
            goodsIdList = getGoodsIdForCalculate();
        } catch (IOException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        for (Integer id : goodsIdList) {
            switch (id) {
                case 1:
                    input.set(new Goods(1, "水", 1.0));
                    break;
                case 2:
                    input.set(new Goods(2, "鸡蛋", 2.0));
                    break;
                case 3:
                    input.set(new Goods(3, "大米", 3));
                    break;
                default:
                    throw new AssertionError();
            }
        }
        Calculator calculator = new Calculator(input.getMap());
        double result = calculator.getResult();
        PrintGoods.print(input);
        System.out.println("Total charge:" + result);
    }

    public static ArrayList<Integer> getGoodsIdForCalculate() throws IOException {
        System.out.println("Please input the ID of the goods:");
        System.out.println("Input q or Q if you want to finish input goods and get the result:");
        ArrayList<Integer> goodsIdList = new ArrayList<Integer>();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = bf.readLine();
            boolean flag = line.equals("q") || line.equals("Q");
            while (line != null && !line.equals("") && !(line.equals("q") || line.equals("Q"))) {
                int id = Integer.valueOf(line);
                goodsIdList.add(id);
                line = bf.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("IO error");
        }
        return goodsIdList;
    }
}
