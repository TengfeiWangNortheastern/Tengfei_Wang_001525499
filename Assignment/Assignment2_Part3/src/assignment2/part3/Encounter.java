/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.part3;

/**
 *
 * @author 主子
 */
public class Encounter {
    private VitalSigns vitalSigns;
    private String timeLine;
    private String doctorOffice;

    public Encounter() {
        
    }

    public Encounter(VitalSigns vitalSigns, String timeLine, String doctorOffice) {
        this.vitalSigns = vitalSigns;
        this.timeLine = timeLine;
        this.doctorOffice = doctorOffice;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }

    public String getTimeLine() {
        return timeLine;
    }

    public void setTimeLine(String timeLine) {
        this.timeLine = timeLine;
        vitalSigns.setTime(timeLine);
    }

    public String getDoctorOffice() {
        return doctorOffice;
    }

    public void setDoctorOffice(String doctorOffice) {
        this.doctorOffice = doctorOffice;
    }
    
}
