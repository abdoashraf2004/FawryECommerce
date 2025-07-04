/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fawry_task;

/**
 *
 * @author B-TECK
 */
public class Customer {
    private double balance;

    public Customer(double balance) {
        this.balance = balance;
    }
    public boolean canPay(double amount) {
        return balance >= amount;
    }
    public void pay(double amount) {
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }
}

