/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.part3;
import java.util.Scanner;

/**
 *
 * @author 主子
 */
public class TestDemo {
    public static void main(String[] args) {
        int numberOfPeople;
        int numberOfPatients;
        int numberOfEncounters;
        
        SystemMedical systemMedical=new SystemMedical();
        PatientDirectory patientDirectory=systemMedical.getPatientDirectory();
        PersonDirectory personDirectory=systemMedical.getPersonDirectory();
        
        Person person;
        Patient patient;

        
        EncounterHistory encounterHistory;
        Encounter encounter;
        
        VitalSigns vitalSigns;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Input The Number Of Patients: ");
        numberOfPatients=sc.nextInt();
        isNumberRight(numberOfPatients, sc);
        
        String firstNameOfPatient,lastNameOfPatient;
        int ageOfPatient;
        for(int i=0;i<numberOfPatients;i++){
            patient=patientDirectory.newPatient();
            encounterHistory=patient.getEncounterHistory();
            System.out.println("Please input fullName of the patient");
            firstNameOfPatient=sc.next();
            lastNameOfPatient=sc.next();
            patient.setFirstName(firstNameOfPatient);
            patient.setLastName(lastNameOfPatient);
            System.out.println("Age of the Patient: ");
            ageOfPatient=sc.nextInt();
            patient.setAge(ageOfPatient);
            
            personDirectory.addPerson(patient);
            
            
            System.out.println("Please input number of Encounters: ");
            numberOfEncounters=sc.nextInt();
            isNumberRight(numberOfEncounters, sc);
            for(int j=0;j<numberOfEncounters;j++){
                encounter=encounterHistory.newEncounter();
                System.out.println("Please set Doctor's Office: ");
                encounter.setDoctorOffice(sc.next());
                System.out.println("Please input the timeLine of encounter(2009/2/21/15:30): ");
                encounter.setTimeLine(sc.next());
                vitalSigns= encounter.getVitalSigns();
                setVitalSignsAttributes(vitalSigns, sc);
                
            }
            
        }
        
        System.out.println("-----------------------patientDirectory-----------------------");
        System.out.println("All the patient is printed below:");
        int countPatient=1;
        int countEncounter=1;
        for(Patient p : patientDirectory.getPatientList()){
            countEncounter=1;
            System.out.println("-----------------------");
            System.out.println("Patient Number: "+(countPatient++)+"    Full Name: "+p.getFullName()+"  Age: "+p.getAge());
            for(Encounter e:p.getEncounterHistory().getEncounterList()){ 
                System.out.println("");
                System.out.println("Encounter "+(countEncounter++)+": "+e.getTimeLine()+"   "+e.getDoctorOffice());
                System.out.println(e.getVitalSigns().toString());
                
            }
            
        }
        System.out.println("---------------------personDirectory-------------------------");
        person=personDirectory.newPerson("Tom","Holland",21);
        for(Person p:personDirectory.getPersonList()){
            countEncounter=1;
            System.out.println("");
            System.out.println("Person Number: "+(countPatient++)+"    Full Name: "+p.getFullName()+"  Age: "+p.getAge());
        }
        }

    private static void setVitalSignsAttributes(VitalSigns vs, Scanner sc) {
        vs.setAgeGroup(sc.next());
        vs.setRespiratoryRate(sc.nextInt());
        vs.setHeartRate(sc.nextInt());
        vs.setSystolicBloodPressure(sc.nextInt());
        vs.setWeightInKilos(sc.nextDouble());
        vs.setWeightInPounds(sc.nextDouble());
    }

    private static void isNumberRight(int numberOf, Scanner sc) {
        while(numberOf<0){
            System.out.println("Your input is wrong, input again: ");
            numberOf = sc.nextInt();
        }  
    }
    
    }

