package com.company.taskPayment;

import java.util.List;

public class Payment {

    Purchase purchase;

    class Purchase {
        private List<Good> goods;

        public Purchase(List<Good> goods) {
            this.goods = goods;
        }

        public List<Good> getGoods() {
            return goods;
        }

        public void setGoods(List<Good> goods) {
            this.goods = goods;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            int count = 0;
            for (Good good : goods) {
                count++;
                sb.append("Purchase ").append(count).append(":  ").append(good).append("\n");
            }
            return sb.toString();
        }
    }
}
