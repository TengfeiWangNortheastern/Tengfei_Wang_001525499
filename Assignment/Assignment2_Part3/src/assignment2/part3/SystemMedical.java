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
public class SystemMedical {
    private PatientDirectory patientDirectory;
    private PersonDirectory personDirectory;

    public SystemMedical() {
        patientDirectory=new PatientDirectory();
        personDirectory=new PersonDirectory();
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
    
}
