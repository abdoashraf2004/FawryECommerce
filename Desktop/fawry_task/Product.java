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
public abstract class Product {
    protected String name;
    protected double price;
    protected int quantity;

    public Product(String name, double price, int quantity) {
        this.name =name;
        this.price =price;
        this.quantity =quantity;}

    public boolean isAvailable(int requested) {
        return quantity >=requested;
    }

    public void reduceQuantity(int amount) {
        quantity -=amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public abstract boolean isExpired();
    public abstract boolean isShippable();
    public abstract double getWeight();
}

