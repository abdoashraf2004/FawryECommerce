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
public class ShippableProduct extends Product {
    private double weight;

    public ShippableProduct(String name, double price, int quantity, double weight) {
        super(name, price, quantity);
        this.weight = weight;
    }

    public boolean isExpired() {
        return false;}

    public boolean isShippable() {
        return true;}

    public double getWeight() {
        return weight;}
}

