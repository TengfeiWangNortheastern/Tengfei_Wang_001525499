/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author 主子
 */
public class OrderItem {
    Product product;
    double salesPrice;
    int quantity;

    public OrderItem(Product product, double salesPrice, int quantity) {
        this.product = product;
        this.salesPrice = salesPrice;
        this.quantity = quantity;
    }
    
}
