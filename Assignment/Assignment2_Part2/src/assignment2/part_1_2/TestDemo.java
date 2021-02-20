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
        Patient patient;
        int numberOfPatients,numberOfVitalSigns;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please input number of patients: ");
        numberOfPatients=sc.nextInt();
        while(numberOfPatients<=0){
            System.out.println("Your input is wrong, input again: ");
            numberOfPatients = sc.nextInt();
        }
        for(int i=0;i<numberOfPatients;i++){
            patient=new Patient();
            System.out.println("Please input number of VitalSigns: ");
            numberOfVitalSigns=sc.nextInt();
            vs=patient.newVitalSign();
            vs.setAgeGroup(sc.next());
            vs.setRespiratoryRate(sc.nextInt());
            vs.setHeartRate(sc.nextInt());
            vs.setSystolicBloodPressure(sc.nextInt());
            vs.setWeightInKilos(sc.nextDouble());
            vs.setWeightInPounds(sc.nextDouble());
            
            if(!patient.isPatientNormal(vs)) System.out.println("***"+vs.toString()+" "+"this is abnormal!");
            System.out.println(vs.toString());
        }
        
    }
}
