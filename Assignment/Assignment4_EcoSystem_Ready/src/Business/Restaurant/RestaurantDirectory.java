/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    ArrayList<Restaurant> restaurantList;
    public RestaurantDirectory() {
        restaurantList = new ArrayList<>();    
    }

    public ArrayList<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(ArrayList<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    public Restaurant addNewRestaurant(UserAccount ua){
        Restaurant restaurant=new Restaurant(ua);
        restaurantList.add(restaurant);
        restaurant.setRestaurantName(ua.getUsername());
        return restaurant;
    }
    public void removeRestaurant(Restaurant restaurant){
        restaurantList.remove(restaurant);
    }
        public boolean checkIfRestaurantNameIsUnique(String username){
        for (Restaurant res : restaurantList){
            if (username.equals(res.getUserAccount().getUsername()))
                return false;
        }
        return true;
    }
}
