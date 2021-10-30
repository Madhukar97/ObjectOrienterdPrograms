package com.bridgelabz;

import java.util.Scanner;

public class Account {
    static double accountBalance;

    public static void main(String[] args) {

        Account obj = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account balance: ");
        accountBalance = sc.nextDouble();
        obj.debit();
        System.out.println("Account Balance = " + accountBalance);
    }

    /**
     * debit method to debit amount from the account balance
     */
    public void debit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the debit amount: ");
        int debitAmount = sc.nextInt();
        if (debitAmount < accountBalance) {
            accountBalance -= debitAmount;
        } else {
            System.out.println("Debit amount exceeded account balance.");
        }
    }
}
