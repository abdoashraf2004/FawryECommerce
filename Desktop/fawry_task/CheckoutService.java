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
import java.util.ArrayList;
import java.util.List;

public class CheckoutService {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            System.out.println("Error: Cart is empty.");
            return;
        }

        double subtotal = 0;
        double shippingCost = 0;
        List<CartItem> toShip = new ArrayList<>();

        for (CartItem item : cart.getItems()) {
            Product p = item.product;
            int q = item.quantity;

            if (!p.isAvailable(q) || p.isExpired()) {
                System.out.println("Error: Product " + p.getName() + " is out of stock or expired.");
                return;
            }

            subtotal += p.getPrice() * q;

            if (p.isShippable()) {
                toShip.add(item);
                shippingCost += 10 * q;
            }
        }

        double total = subtotal + shippingCost;

        if (!customer.canPay(total)) {
            System.out.println("Error: Insufficient balance.");
            return;
        }

        for (CartItem item : cart.getItems()) {
            item.product.reduceQuantity(item.quantity);
        }

        customer.pay(total);

        if (!toShip.isEmpty()) {
            ShippingService.ship(toShip);
        }

        System.out.println();
        System.out.println("** Checkout receipt **");

        for (CartItem item : cart.getItems()) {
            double totalPrice = item.product.getPrice() * item.quantity;
            System.out.println(item.quantity + "x " + item.product.getName() + "    " + (int)totalPrice);
        }

        System.out.println("----------------------");
        System.out.println("Subtotal        " + (int)subtotal);
        System.out.println("Shipping        " + (int)shippingCost);
        System.out.println("Amount          " + (int)total);
        System.out.println("Remaining Balance    " + (int)customer.getBalance());
    }
}

