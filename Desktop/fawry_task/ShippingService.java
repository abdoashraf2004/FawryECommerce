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
import java.util.List;

import java.util.List;

public class ShippingService {
    public static void ship(List<CartItem> items) {
        double totalWeight = 0;
        System.out.println(" Shipment notice ");

        for (CartItem item : items) {
            double weightInGrams = item.product.getWeight() * item.quantity * 1000;
            System.out.println(item.quantity + "x " + item.product.getName() + "    " + (int)weightInGrams + "g");
            totalWeight += item.product.getWeight() * item.quantity;
        }

        System.out.println("Total package weight " + String.format("%.1f", totalWeight) + "kg");
    }
}


