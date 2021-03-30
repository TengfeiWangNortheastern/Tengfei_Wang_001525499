/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author archil
 */
public class FoodCatalog {

    private List<Food> productCatalog;

    public FoodCatalog() {
        productCatalog = new ArrayList<Food>();
    }

    public List<Food> getProductcatalog() {
        return productCatalog;
    }

    public Food addProduct() {
        Food p = new Food();
        productCatalog.add(p);
        return p;
    }

    public void removeProduct(Food p) {
        productCatalog.remove(p);
    }

    public Food searchProduct(int id) {
        for (Food product : productCatalog) {
            if (product.getModelNumber() == id) {
                return product;
            }
        }
        return null;
    }
}
