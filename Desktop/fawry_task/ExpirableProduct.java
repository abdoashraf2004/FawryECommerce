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
import java.time.LocalDate;

public class ExpirableProduct extends Product {
    private LocalDate expiryDate;
    private double weight;

    public ExpirableProduct(String name, double price, int quantity, LocalDate expiryDate, double weight) {
        super(name, price, quantity);
        this.expiryDate = expiryDate;
        this.weight = weight;}

    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);}

    public boolean isShippable() {
        return weight >0;}

    public double getWeight() {
        return weight;}
}

