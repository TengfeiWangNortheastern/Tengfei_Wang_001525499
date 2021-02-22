/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.part_1_2;
import java.util.Scanner;

/**
 *
 * @author 主子
 */
public class TestDemo {
    public static void main(String[] args) {
        VitalSigns vs;
        Patient patient=new Patient();
        int numberOfVitalSigns;
        Scanner sc=new Scanner(System.in);

        System.out.println("Please input fullName of the patient");
        patient.setFirstName(sc.next());
        patient.setLastName(sc.next());
        System.out.println("Please input number of VitalSigns: ");
        numberOfVitalSigns=sc.nextInt();

        while(numberOfVitalSigns<=0){
            System.out.println("Your input is wrong, input again: ");
            numberOfVitalSigns = sc.nextInt();
    }
        //input all the vital signs of a patient
        // <editor-fold> input all the vital signs of a patient
        for(int j=0;j<numberOfVitalSigns;j++){

            vs=patient.newVitalSign();
            vs.setTime(sc.next());
            vs.setAgeGroup(sc.next());
            vs.setRespiratoryRate(sc.nextInt());
            vs.setHeartRate(sc.nextInt());
            vs.setSystolicBloodPressure(sc.nextInt());
            vs.setWeightInKilos(sc.nextDouble());
            vs.setWeightInPounds(sc.nextDouble());

    }
        // </editor-fold>
        
        //test vital signs history
        System.out.println("Vital Signs History: ");
        System.out.println("Full Name:"+patient.getFullName());
            
        int countVs=1;
        for(VitalSigns currentVs:patient.getHistory()){            
            if(!patient.isPatientNormal(currentVs)) System.out.println("Vital Signs "+countVs+": "+currentVs.toString()+" "+"this is abnormal!");
            else System.out.println("Vital Signs "+countVs+": "+currentVs.toString());
            countVs++;
        }

        //test isThisVitalSignNormal
        int indexOfVitalSign;
        String vitalSignName;
        System.out.println("Please input the index of a vital sign and the name of it(hint:RespiratoryRate HeartRate SystolicBloodPressure WeightInKilos WeightInPounds):");
        indexOfVitalSign=sc.nextInt();
        vitalSignName=sc.next();
        if(patient.getHistory().get(indexOfVitalSign).isThisVitalSignNormal(vitalSignName))
            System.out.println(vitalSignName+" is normal");
        else
            System.out.println(vitalSignName+" is abnormal!");
        }
    }

