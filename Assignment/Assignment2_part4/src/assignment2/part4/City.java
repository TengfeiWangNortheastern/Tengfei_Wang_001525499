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
public class City {
    private String addressCity;
    private SystemMedical citymedicalSystem;
    private ArrayList<Community> communityList=new ArrayList<Community>();

    public City() {
        citymedicalSystem=new SystemMedical();
    }

    public City(String addressCity) {
        this.addressCity = addressCity;
        citymedicalSystem = new SystemMedical();
    }

    public SystemMedical getCitymedicalSystem() {
        return citymedicalSystem;
    }

    public void setCitymedicalSystem(SystemMedical citymedicalSystem) {
        this.citymedicalSystem = citymedicalSystem;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }


    public ArrayList<Community> getCommunityList() {
        return communityList;
    }

    public void setCommunityList(ArrayList<Community> communityList) {
        this.communityList = communityList;
    }
    public Community newCommunity(){
        Community newCommunity=new Community();
        communityList.add(newCommunity);
        newCommunity.setAddressCity(addressCity);
        return newCommunity;
    }
}
