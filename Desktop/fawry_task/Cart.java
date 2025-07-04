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

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void add(Product product, int quantity) {
        if (quantity <= product.getQuantity()) {
            items.add(new CartItem(product, quantity));
        } else {
            System.out.println("Not enough stock for " + product.getName());
        }}
    public List<CartItem> getItems() {
        return items;}
    
    public boolean isEmpty() {
        return items.isEmpty();}
}

