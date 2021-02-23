/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.part1;
import java.util.Scanner;

/**
 *
 * @author 主子
 */
public class TestDemo {
    public static void main(String[] args) {
        VitalSigns vs;
        Patient patient;
        int numberOfPatients;
        Scanner sc=new Scanner(System.in);
        System.out.print("Please input number of patients: ");
        numberOfPatients=sc.nextInt();
        while(numberOfPatients<=0){
            System.out.println("Your input is wrong, input again: ");
            numberOfPatients = sc.nextInt();
        }
        for(int i=0;i<numberOfPatients;i++){
            vs=new VitalSigns();
            vs.setAgeGroup(sc.next());
            vs.setRespiratoryRate(sc.nextInt());
            vs.setHeartRate(sc.nextInt());
            vs.setSystolicBloodPressure(sc.nextInt());
            vs.setWeightInKilos(sc.nextDouble());
            vs.setWeightInPounds(sc.nextDouble());
            
            patient=new Patient(vs);
            if(!patient.isPatientNormal()) System.out.println("Patient"+(i+1)+": "+vs.toString()+" "+"this is abnormal!");
            else System.out.println("Patient"+(i+1)+": "+vs.toString());
        }
        
    }
}
