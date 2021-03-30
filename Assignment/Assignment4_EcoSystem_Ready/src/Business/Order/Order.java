/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;

/**
 *
 * @author 主子
 */
public class Order {
    ArrayList<OrderItem> orderItemList;

    public Order() {
        this.orderItemList=new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }
    public void addNewOrderItem(Food product,double price,int quantity){
        OrderItem orderItem=new OrderItem(product,price,quantity);
        orderItemList.add(orderItem);
    }
    
    public void deleteItem(OrderItem item){
        this.orderItemList.remove(item);
    }
    
    public OrderItem findProduct(Food product){
        for(OrderItem oi:this.getOrderItemList()){
            if(product.equals(oi.getProduct())){
                return oi;
            }
        }
        return null;
    }
}
