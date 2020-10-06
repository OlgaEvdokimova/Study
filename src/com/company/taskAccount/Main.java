package com.company.taskAccount;

public class Main {

    public static void main(String[] args) {
        Account account = new Account();
        account.addWithdraw(10);
        account.addPayment(35);
        account.addIncome(200);
        account.addIncome(200);
        account.addWithdraw(100);
        System.out.println(account);
    }
}
