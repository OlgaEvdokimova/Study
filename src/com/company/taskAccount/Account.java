package com.company.taskAccount;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private Withdraw withdraw;
    private Payment payment;
    private Income income;
    private List<Operable> operables = new ArrayList<>();

    private class Withdraw implements Operable {
        int money;

        public Withdraw(int money) {
            this.money = money;
        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        @Override
        public void view() {
            System.out.println("Withdraw: " + getMoney());
        }

        @Override
        public String toString() {
            return "Withdraw: " + money;
        }
    }

    private class Payment implements Operable {
        int money;

        public Payment(int money) {
            this.money = money;
        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        @Override
        public void view() {
            System.out.println("Payment: " + getMoney());
        }

        @Override
        public String toString() {
            return "Payment: " + money;
        }
    }

    private class Income implements Operable {
        int money;

        public Income(int money) {
            this.money = money;
        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }

        @Override
        public void view() {
            System.out.println("Income: " + getMoney());
        }

        @Override
        public String toString() {
            return "Income: " + money ;
        }
    }

    public void addWithdraw(int money) {
        Withdraw withdraw = new Withdraw(money);
        operables.add(withdraw);
    }

    public void addIncome(int money) {
        Income income = new Income(money);
        operables.add(income);
    }

    public void addPayment(int money) {
        Payment payment = new Payment(money);
        operables.add(payment);
    }

    public void view(){
        for (Operable o : operables){
            o.view();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Operable o : operables){
            sb.append(o).append("\n");
        }
        return sb.toString();
    }
}
