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
public class House {
    private String addressHouse;
    private String addressCommunity;
    private String addressCity;
    private String addressFull;
    private ArrayList<Person> residenceList=new ArrayList<Person>();
    public House() {
        
    }

    public String getAddressFull() {
        return addressHouse+addressCommunity+addressCity;
    }

    public House(String addressHouse) {
        this.addressHouse = addressHouse;
    }

    public void setAddressFull(String addressFull) {
        this.addressFull = addressFull;
    }

    public String getAddressHouse() {
        return addressHouse;
    }

    public void setAddressHouse(String addressHouse) {
        this.addressHouse = addressHouse;
    }

    public String getAddressCommunity() {
        return addressCommunity;
    }

    public void setAddressCommunity(String addressCommunity) {
        this.addressCommunity = addressCommunity;
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity;
    }


    public ArrayList<Person> getResidenceList() {
        return residenceList;
    }

    public void setResidenceList(ArrayList<Person> residenceList) {
        this.residenceList = residenceList;
    }
    public void addResidence(Person p){
        residenceList.add(p);
    }
    public void deleteResidence(String name){
        for(Person residencePerson:residenceList){
            if(name.equals(residencePerson.getFullName()))
                residenceList.remove(residencePerson);
        }
    }
}
