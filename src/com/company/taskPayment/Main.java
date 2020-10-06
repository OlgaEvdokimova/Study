package com.company.taskPayment;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Good good1 = new Good("skirt", 20);
        Good good2 = new Good("pants", 25);
        List<Good> goods = new ArrayList<>();
        goods.add(good1);
        goods.add(good2);
        Payment payment = new Payment();
        Payment.Purchase purchase = payment.new Purchase(goods);
        System.out.println(purchase);
    }
}
