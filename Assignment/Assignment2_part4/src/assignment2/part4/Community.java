/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.part4;

import java.util.ArrayList;

/**
 *
 * @author NURES
 */
public class Community {
    private String addressCommnity;
    private String addressCity;
    private ArrayList<House> houseList=new ArrayList<House>();

    public Community() {
    }

    public Community(String addressCity) {
        this.addressCity = addressCity;
    }

    public String getAddressCommnity() {
        return addressCommnity;
    }

    public void setAddressCommnity(String addressCommnity) {
        this.addressCommnity = addressCommnity;
    }


    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }

    public void setHouseList(ArrayList<House> houseList) {
        this.houseList = houseList;
    }
    
    public House newHouse(){
        House newHouse = new House();
        newHouse.setAddressCommunity(addressCommnity);
        newHouse.setAddressCity(addressCity);
        houseList.add(newHouse); 
        return newHouse;
    }
    public House findHouse(String houseName){
        for(House h:houseList){
            if(houseName.equals(h.getAddressHouse())){
                return h;
            }
        }
        return null;
    }
}
