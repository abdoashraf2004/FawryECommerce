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
public class NonShippableProduct extends Product {
    
    public NonShippableProduct(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    public boolean isExpired() {
        return false;}

    public boolean isShippable() {
        return false;}

    public double getWeight() {
        return 0;}
}
