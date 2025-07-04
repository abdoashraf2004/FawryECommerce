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
public class CartItem {
    public Product product;
    public int quantity;

    public CartItem(Product product,int quantity) {
        this.product =product;
        this.quantity =quantity;
    }
}

