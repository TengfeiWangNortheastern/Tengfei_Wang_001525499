/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.part3;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 主子
 */
public class TestDemo {
    public static ArrayList<String> ageGroups = new ArrayList<String>();
    public static void main(String[] args) {
        ageGroups.add("Newborn");
        ageGroups.add("Infant");
        ageGroups.add("Adolescent");
        ageGroups.add("Toddler");
        ageGroups.add("Preschooler");
        ageGroups.add("SchoolAge");
        String[] listVitalSignsName={"RespiratoryRate","HeartRate","SystolicBloodPressure","WeightInKilos","WeightInPounds"};
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
            numberOfEncounters=isNumberRight(numberOfEncounters, sc);
            for(int j=0;j<numberOfEncounters;j++){
                encounter=encounterHistory.newEncounter();
                System.out.println("Please set Doctor's Office: ");
                encounter.setDoctorOffice(sc.next());
                System.out.println("Please input the timeLine of encounter eg. ( 2009/2/21/15:30 ): ");
                String timeline = sc.next();
                //check time line here
                while (!(timeline.matches("[0-9]{4}/[0-9]+/[0-9]+/+[0-9]{2}:[0-9]{2}"))) {
                    System.out.println("Please input the timeLine of encounter: ");
                    timeline = sc.next();
                }
                encounter.setTimeLine(timeline);
                vitalSigns= encounter.getVitalSigns();
                setVitalSignsAttributes(vitalSigns, sc);
                
            }
            
        }
        
        System.out.println("-----------------------patientDirectory-----------------------");
        System.out.println("All the patient is printed below:");
        int countPatient=1;
        int countEncounter=1;
        for(Patient p : patientDirectory.getPatientList()){
            showInformation(countPatient, p, listVitalSignsName);
            countPatient++;
        }
        System.out.println("--find patient by name, function test");
        String nameoffindpatient="Randy Taylor";
        Patient patientFound=patientDirectory.findPatient(nameoffindpatient);
        showInformation(patientFound,listVitalSignsName);
        
        System.out.println("--find Patient by name test--");
        String nametofindpatient="Randy Taylor"; //input the name here to check in person directory
        Patient patientFound2=patientDirectory.findPatient(nametofindpatient);
        System.out.println("Full Name: "+patientFound2.getFullName()+"  Age: "+patientFound2.getAge());
        
        System.out.println("--find Person by id test");
        int idToFindPatient=5; // input the id here
        patientFound2=patientDirectory.findPatient(idToFindPatient);
        System.out.println("Full Name: "+patientFound2.getFullName()+"  Age: "+patientFound2.getAge());
        System.out.println("---------------------personDirectory-------------------------");
        int countPerson=1;
        person=personDirectory.newPerson("Tom","Holland",21);
        for(Person p:personDirectory.getPersonList()){
            countEncounter=1;
            System.out.println("");
            System.out.println("Person Number: "+(countPerson++)+"    Full Name: "+p.getFullName()+"  Age: "+p.getAge());
        }
        System.out.println("--find Person by name test--");
        String nametofindperson="Randy Taylor"; //input the name here to check in person directory
        Person personFound=personDirectory.findPerson(nametofindperson);
        System.out.println("Full Name: "+personFound.getFullName()+"  Age: "+personFound.getAge());
        
        System.out.println("--find Person by id test");
        int idToFindPerson=6; // input the id here
        personFound=personDirectory.findPerson(idToFindPerson);
        System.out.println("Full Name: "+personFound.getFullName()+"  Age: "+personFound.getAge());

        }
        
       

    private static void showInformation(int countPatient, Patient p, String[] listVitalSignsName) {
        int countEncounter;
        countEncounter=1;
        System.out.println("-----------------------");
        System.out.println("Patient Number: "+(countPatient)+"    Full Name: "+p.getFullName()+"  Age: "+p.getAge());
        for(Encounter e:p.getEncounterHistory().getEncounterList()){
            System.out.println("");
            System.out.println("Encounter "+(countEncounter++)+": "+e.getTimeLine()+"   "+e.getDoctorOffice());
            System.out.println(e.getVitalSigns().toString());
            
            //print all the abnormal vital signs
            int signCount=listVitalSignsName.length;
            if(!e.getVitalSigns().signNormal()){
                System.out.print("Abnormal Signs: ");
                for(String ss:listVitalSignsName){
                    if(!e.getVitalSigns().isThisVitalSignNormal(ss)){
                        System.out.print(ss+" ");
                    }
                }
                System.out.println("");
            }
            String sign="RespiratoryRate"; //input the sign you want to check
            if(!e.getVitalSigns().isThisVitalSignNormal(sign))
                System.out.println(sign+" "+"Is Abnormal!!!");
//                System.out.println(e.getVitalSigns().areTheSignsNormal());
        }
    }
    private static void showInformation(Patient p, String[] listVitalSignsName) {
        int countEncounter;
        countEncounter=1;
        System.out.println("-----------------------");
        System.out.println("Patient Number: "+"    Full Name: "+p.getFullName()+"  Age: "+p.getAge());
        for(Encounter e:p.getEncounterHistory().getEncounterList()){
            System.out.println("");
            System.out.println("Encounter "+(countEncounter++)+": "+e.getTimeLine()+"   "+e.getDoctorOffice());
            System.out.println(e.getVitalSigns().toString());
            
            //print all the abnormal vital signs
            int signCount=listVitalSignsName.length;
            if(!e.getVitalSigns().signNormal()){
                System.out.print("Abnormal Signs: ");
                for(String ss:listVitalSignsName){
                    if(!e.getVitalSigns().isThisVitalSignNormal(ss)){
                        System.out.print(ss+" ");
                    }
                }
                System.out.println("");
            }
            String sign="RespiratoryRate"; //input the sign you want to check
            if(!e.getVitalSigns().isThisVitalSignNormal(sign))
                System.out.println(sign+" "+"Is Abnormal!!!");
//                System.out.println(e.getVitalSigns().areTheSignsNormal());
        }
    }
    private static void setVitalSignsAttributes(VitalSigns vs, Scanner sc) {
        String ageGroup = sc.next();
        while (!ageGroups.contains(ageGroup)) {
            System.out.println("Your age group input is wrong,please input again");
            ageGroup = sc.next();
        }
        vs.setAgeGroup(ageGroup);
        try {
            vs.setRespiratoryRate(sc.nextInt());
            vs.setHeartRate(sc.nextInt());
            vs.setSystolicBloodPressure(sc.nextInt());
            vs.setWeightInKilos(sc.nextDouble());
        } catch (Exception e) {
            System.out.println("Your vital sign input should be a number");
        }
//        System.out.println("Weight in ponds equals weight in kilos by 2.2:");
//        vs.setWeightInPounds(sc.nextDouble());
    }

    private static int isNumberRight(int numberOf, Scanner sc) {
        while(numberOf<0){
            System.out.println("Your input is wrong, input again: ");
            numberOf = sc.nextInt();
        }  
        return  numberOf;
    }
    
    }

