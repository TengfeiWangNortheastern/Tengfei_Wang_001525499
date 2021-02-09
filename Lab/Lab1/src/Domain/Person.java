/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import Domain.Adress;
/**
 *
 * @author 主子
 */
public class Person {
    private String lastName;
    private String firstName;
    private String dateOfBirth;
    private String height;
    private String weight;
    private String SSN;
    private String streetAddressArea;
    
    Adress workAdress;
    Adress homeAdress;
    Adress localAdress;
    
    Account savingAccount;
    Account checkingAccount;
    
    DriversLicence driverLicence;
    
    MedicalRecord medicalRecord;

    public Person() {
    }

    public String getStreetAddressArea() {
        return streetAddressArea;
    }

    public void setStreetAddressArea(String streetAddressArea) {
        this.streetAddressArea = streetAddressArea;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public Adress getWorkAdress() {
        return workAdress;
    }

    public void setWorkAdress(Adress workAdress) {
        this.workAdress = workAdress;
    }

    public Adress getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(Adress homeAdress) {
        this.homeAdress = homeAdress;
    }

    public Adress getLocalAdress() {
        return localAdress;
    }

    public void setLocalAdress(Adress localAdress) {
        this.localAdress = localAdress;
    }

    public Account getSavingAccount() {
        return savingAccount;
    }

    public void setSavingAccount(Account savingAccount) {
        this.savingAccount = savingAccount;
    }

    public Account getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(Account checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public DriversLicence getDriverLicence() {
        return driverLicence;
    }

    public void setDriverLicence(DriversLicence driverLicence) {
        this.driverLicence = driverLicence;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    
}
