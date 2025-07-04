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

public class Main {
    public static void main(String[] args) {
        Product cheese = new ExpirableProduct("Cheese", 100, 5, LocalDate.now().plusDays(2), 0.2);
        Product biscuits = new ExpirableProduct("Biscuits", 150, 3, LocalDate.now().plusDays(5), 0.7);
        Product tv = new ShippableProduct("TV", 3000, 2, 10.0);
        Product scratchCard = new NonShippableProduct("Mobile scratch card", 50, 10);

        Customer customer = new Customer(1000);
        Cart cart = new Cart();

        cart.add(cheese, 2);
        cart.add(biscuits, 1);
        cart.add(scratchCard, 1);

        CheckoutService.checkout(customer, cart);
    }
}

