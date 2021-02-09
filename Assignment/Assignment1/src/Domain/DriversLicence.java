/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author 主子
 */
public class DriversLicence {
    private String licenceNumber;
    private String dateOfExpiration;
    private String bloodType;
    private String dateIssued;
    private JFileChooser chooser;
    private ImageIcon imgPortrait; 
    
    public DriversLicence() {
        
    }

    public ImageIcon getImgPortrait() {
        return imgPortrait;
    }

    public void setImgPortrait(ImageIcon imgPortrait) {
        this.imgPortrait = imgPortrait;
    }

    public JFileChooser getChooser() {
        return chooser;
    }

    public void setChooser(JFileChooser chooser) {
        this.chooser = chooser;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public String getDateOfExpiration() {
        return dateOfExpiration;
    }

    public void setDateOfExpiration(String dateOfExpiration) {
        this.dateOfExpiration = dateOfExpiration;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getDateIssued() {
        return dateIssued;
    }

    public void setDateIssued(String dateIssued) {
        this.dateIssued = dateIssued;
    }
    
}
