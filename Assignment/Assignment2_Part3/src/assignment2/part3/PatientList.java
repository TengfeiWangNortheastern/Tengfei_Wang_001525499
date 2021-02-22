/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.part3;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author NURES
 */
public class PatientList {
    List<Patient> patientList;

    public PatientList() {
        patientList=new ArrayList<>();
    }

    public List<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(List<Patient> patientList) {
        this.patientList = patientList;
    }
    public Patient newPatient(){
        Patient p=new Patient();
        patientList.add(p);
        return p;
    }
    public Patient findPatient(String name){
        for(Patient p:patientList){
            if(name.equals(p.getFullName())){
                System.out.println("The records of Vital Signs of "+name+" is: ");
                for(VitalSigns vs:p.getHistory()){
                    System.out.println(vs);
                }
                return p;
            }
        }
        System.out.println("Could not find the patient,please try again!");
        return null;
    }
}