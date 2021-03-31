/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Order.FoodCatalog;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JPanel;
import userinterface.Restaurant.RestaurantManagerWorkAreaJPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author NURES
 */
public class RestaurantManagerRole extends Role{

      public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
        return new RestaurantManagerWorkAreaJPanel(userProcessContainer,account,organization,enterprise,system);
    }
//    
//    private FoodCatalog foodCatalog;
//    
//    public FoodCatalog getFoodCatalog() {
//        return foodCatalog;
//    }
//
//    public void setFoodCatalog(FoodCatalog foodCatalog) {
//        this.foodCatalog = foodCatalog;
//    }
//    
//    public void newFoodCatalog(){
//        if(foodCatalog==null)
//            foodCatalog=new FoodCatalog();
//    }
}
