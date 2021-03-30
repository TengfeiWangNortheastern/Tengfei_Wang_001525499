/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

/**
 *
 * @author 主子
 */
public class OrderItem {
    Food product;
    double salesPrice;
    int quantity;

    public OrderItem(Food product, double salesPrice, int quantity) {
        this.product = product;
        this.salesPrice = salesPrice;
        this.quantity = quantity;
    }

    public Food getProduct() {
        return product;
    }

    public void setProduct(Food product) {
        this.product = product;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return product.toString();
    }
}
