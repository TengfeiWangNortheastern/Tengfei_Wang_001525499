/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Order.FoodCatalog;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String restaurantName;
    private FoodCatalog foodCatalog;

    public Restaurant() {
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public FoodCatalog getFoodCatalog() {
        return foodCatalog;
    }

    public void setFoodCatalog(FoodCatalog foodCatalog) {
        this.foodCatalog = foodCatalog;
    }

    @Override
    public String toString() {
        return restaurantName;
    }
    
    
}
