/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.part3;

/**
 *
 * @author NURES
 */
public class VitalSigns {
    private String time;
    private String ageGroup;
    private int respiratoryRate;
    private int heartRate;
    private int  systolicBloodPressure;
    private double weightInKilos;
    private double weightInPounds;

    public VitalSigns() { 
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(int systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    public double getWeightInKilos() {
        return weightInKilos;
    }

    public void setWeightInKilos(double weightInKilos) {
        this.weightInKilos = weightInKilos;
    }

    public double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
    public boolean[] areTheSignsNormal(){
         String ageGroup=this.getAgeGroup();
        int respiratoryRate=this.getRespiratoryRate();
        int hearRate=this.getHeartRate();
        int sBloodPressure=this.getSystolicBloodPressure();
        double weightInKilos=this.getWeightInKilos();
        double weightInPounds=this.getWeightInPounds();
        
        
        if("Newborn".equals(ageGroup)){
            boolean[] newbornIsNormal=new boolean[5];
            if(respiratoryRate>=30 && respiratoryRate<=50) 
                newbornIsNormal[0]=true;
            if(hearRate>=120 &&hearRate<=160) 
                newbornIsNormal[1]=true;
            if(sBloodPressure>=50 && sBloodPressure<=70)
                newbornIsNormal[2]=true;
            if(weightInKilos>=2 &&weightInKilos<=3)
                newbornIsNormal[3]=true;
            if(weightInPounds>=4.5 &&weightInPounds<=7)
                newbornIsNormal[4]=true;
            return newbornIsNormal;
        }
        if ("Infant".equals(ageGroup)) {
            boolean[] infantIsNormal = new boolean[5];
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                infantIsNormal[0] = true;
            }
            if (hearRate >= 80 && hearRate <= 140) {
                infantIsNormal[1] = true;
            }
            if (sBloodPressure >= 70 && sBloodPressure <= 100) {
                infantIsNormal[2] = true;
            }
            if (weightInKilos >= 4 && weightInKilos <=10) {
                infantIsNormal[3] = true;
            }
            if (weightInPounds >= 9 && weightInPounds <=22) {
                infantIsNormal[4] = true;
            }
            return infantIsNormal;
        }
        if ("Toddler".equals(ageGroup)) {
            boolean[] toddlerIsNormal = new boolean[5];
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                toddlerIsNormal[0] = true;
            }
            if (hearRate >= 80 && hearRate <= 130) {
                toddlerIsNormal[1] = true;
            }
            if (sBloodPressure >= 80 && sBloodPressure <= 110) {
                toddlerIsNormal[2] = true;
            }
            if (weightInKilos >= 10 && weightInKilos <= 14) {
                toddlerIsNormal[3] = true;
            }
            if (weightInPounds >= 22 && weightInPounds <= 31) {
                toddlerIsNormal[4] = true;
            }
           return toddlerIsNormal;
        }
        if ("Preschooler".equals(ageGroup)) {
            boolean[] preschoolerIsNormal = new boolean[5];
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                preschoolerIsNormal[0] = true;
            }
            if (hearRate >= 80 && hearRate <= 120) {
                preschoolerIsNormal[1] = true;
            }
            if (sBloodPressure >= 80 && sBloodPressure <= 110) {
                preschoolerIsNormal[2] = true;
            }
            if (weightInKilos >= 14 && weightInKilos <= 18) {
                preschoolerIsNormal[3] = true;
            }
            if (weightInPounds >= 31 && weightInPounds <= 40) {
                preschoolerIsNormal[4] = true;
            }
            return preschoolerIsNormal;
        }
        if ("School Age".equals(ageGroup)) {
            boolean[] schoolAgeIsNormal = new boolean[5];
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                schoolAgeIsNormal[0] = true;
            }
            if (hearRate >= 70 && hearRate <= 110) {
                schoolAgeIsNormal[1] = true;
            }
            if (sBloodPressure >= 80 && sBloodPressure <= 120) {
                schoolAgeIsNormal[2] = true;
            }
            if (weightInKilos >= 20 && weightInKilos <= 42) {
                schoolAgeIsNormal[3] = true;
            }
            if (weightInPounds >= 41 && weightInPounds <= 92) {
                schoolAgeIsNormal[4] = true;
            }
            return schoolAgeIsNormal;
        }
        if ("Adolescent".equals(ageGroup)) {
            boolean[] adolescentIsNormal = new boolean[5];
            if (respiratoryRate >= 12 && respiratoryRate <= 20) {
                adolescentIsNormal[0] = true;
            }
            if (hearRate >= 55 && hearRate <= 105) {
                adolescentIsNormal[1] = true;
            }
            if (sBloodPressure >= 110 && sBloodPressure <= 120) {
                adolescentIsNormal[2] = true;
            }
            if (weightInKilos >50) {
                adolescentIsNormal[3] = true;
            }
            if (weightInPounds >110) {
                adolescentIsNormal[4] = true;
            }
            return adolescentIsNormal;
        }

        return null;
    }
    public boolean isThisVitalSignNormal(String vsign){
        // vsign is time of VitalSigns
        boolean[] signsNormalList=areTheSignsNormal();
        if(vsign.equals("RespiratoryRate")){
            return signsNormalList[0];
        }    
        if(vsign.equals("HeartRate")){
            return signsNormalList[1];
        }
        if(vsign.equals("SystolicBloodPressure")){
            return signsNormalList[2];
        }
        if(vsign.equals("WeightInKilos")){
            return signsNormalList[3];
        }
        if(vsign.equals("WeightInPounds")){
            return signsNormalList[4];
        }
        System.out.println("Your input is incorrect!Please input again:");
        return false;
        }
        public boolean isPatientNormal(){
        String ageGroup=this.getAgeGroup();
        int respiratoryRate=this.getRespiratoryRate();
        int hearRate=this.getHeartRate();
        int sBloodPressure=this.getSystolicBloodPressure();
        double weightInKilos=this.getWeightInKilos();
        double weightInPounds=this.getWeightInPounds();
        
        
        if("Newborn".equals(ageGroup)){
            boolean[] newbornIsNormal=new boolean[5];
            if(respiratoryRate>=30 && respiratoryRate<=50) 
                newbornIsNormal[0]=true;
            if(hearRate>=120 &&hearRate<=160) 
                newbornIsNormal[1]=true;
            if(sBloodPressure>=50 && sBloodPressure<=70)
                newbornIsNormal[2]=true;
            if(weightInKilos>=2 &&weightInKilos<=3)
                newbornIsNormal[3]=true;
            if(weightInPounds>=4.5 &&weightInPounds<=7)
                newbornIsNormal[4]=true;
            for(boolean b:newbornIsNormal){
                if(b==false){
                    return false;
                }
            }
        }
        if ("Infant".equals(ageGroup)) {
            boolean[] infantIsNormal = new boolean[5];
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                infantIsNormal[0] = true;
            }
            if (hearRate >= 80 && hearRate <= 140) {
                infantIsNormal[1] = true;
            }
            if (sBloodPressure >= 70 && sBloodPressure <= 100) {
                infantIsNormal[2] = true;
            }
            if (weightInKilos >= 4 && weightInKilos <=10) {
                infantIsNormal[3] = true;
            }
            if (weightInPounds >= 9 && weightInPounds <=22) {
                infantIsNormal[4] = true;
            }
            for (boolean b : infantIsNormal) {
                if (b == false) {
                    return false;
                }
            }
        }
        if ("Toddler".equals(ageGroup)) {
            boolean[] toddlerIsNormal = new boolean[5];
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                toddlerIsNormal[0] = true;
            }
            if (hearRate >= 80 && hearRate <= 130) {
                toddlerIsNormal[1] = true;
            }
            if (sBloodPressure >= 80 && sBloodPressure <= 110) {
                toddlerIsNormal[2] = true;
            }
            if (weightInKilos >= 10 && weightInKilos <= 14) {
                toddlerIsNormal[3] = true;
            }
            if (weightInPounds >= 22 && weightInPounds <= 31) {
                toddlerIsNormal[4] = true;
            }
            for (boolean b : toddlerIsNormal) {
                if (b == false) {
                    return false;
                }
            }
        }
        if ("Preschooler".equals(ageGroup)) {
            boolean[] preschoolerIsNormal = new boolean[5];
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                preschoolerIsNormal[0] = true;
            }
            if (hearRate >= 80 && hearRate <= 120) {
                preschoolerIsNormal[1] = true;
            }
            if (sBloodPressure >= 80 && sBloodPressure <= 110) {
                preschoolerIsNormal[2] = true;
            }
            if (weightInKilos >= 14 && weightInKilos <= 18) {
                preschoolerIsNormal[3] = true;
            }
            if (weightInPounds >= 31 && weightInPounds <= 40) {
                preschoolerIsNormal[4] = true;
            }
            for (boolean b : preschoolerIsNormal) {
                if (b == false) {
                    return false;
                }
            }
        }
        if ("School Age".equals(ageGroup)) {
            boolean[] schoolAgeIsNormal = new boolean[5];
            if (respiratoryRate >= 20 && respiratoryRate <= 30) {
                schoolAgeIsNormal[0] = true;
            }
            if (hearRate >= 70 && hearRate <= 110) {
                schoolAgeIsNormal[1] = true;
            }
            if (sBloodPressure >= 80 && sBloodPressure <= 120) {
                schoolAgeIsNormal[2] = true;
            }
            if (weightInKilos >= 20 && weightInKilos <= 42) {
                schoolAgeIsNormal[3] = true;
            }
            if (weightInPounds >= 41 && weightInPounds <= 92) {
                schoolAgeIsNormal[4] = true;
            }
            for (boolean b : schoolAgeIsNormal) {
                if (b == false) {
                    return false;
                }
            }
        }
        if ("Adolescent".equals(ageGroup)) {
            boolean[] adolescentIsNormal = new boolean[5];
            if (respiratoryRate >= 12 && respiratoryRate <= 20) {
                adolescentIsNormal[0] = true;
            }
            if (hearRate >= 55 && hearRate <= 105) {
                adolescentIsNormal[1] = true;
            }
            if (sBloodPressure >= 110 && sBloodPressure <= 120) {
                adolescentIsNormal[2] = true;
            }
            if (weightInKilos >50) {
                adolescentIsNormal[3] = true;
            }
            if (weightInPounds >110) {
                adolescentIsNormal[4] = true;
            }
            for (boolean b : adolescentIsNormal) {
                if (b == false) {
                    return false;
                }
            }
        }

        return true;
    }
    @Override
    public String toString() {
        if(!isPatientNormal())
            return "Abnormal VitalSigns" + "ageGroup=" + ageGroup + ", respiratoryRate=" + respiratoryRate + ", heartRate=" + heartRate + ", systolicBloodPressure=" + systolicBloodPressure + ", weightInKilos=" + weightInKilos + ", weightInPounds=" + weightInPounds;
        return  "VitalSigns: ageGroup=" + ageGroup + ", respiratoryRate=" + respiratoryRate + ", heartRate=" + heartRate + ", systolicBloodPressure=" + systolicBloodPressure + ", weightInKilos=" + weightInKilos + ", weightInPounds=" + weightInPounds ;
    }

}
