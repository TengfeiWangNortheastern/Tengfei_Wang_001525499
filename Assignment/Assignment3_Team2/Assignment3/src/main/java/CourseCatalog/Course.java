/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseCatalog;

/**
 *
 * @author Dengbowen
 */
public class Course {
    String number;
    String name;
    int credits;
    int price = 1500; //per credit hour
    public Course(String n, String numb, int ch){
        name = n;
        number = numb;
        credits = ch;
        
        
    }
    public Course(String n){
     name = n;
        
        
    }
    public String getCOurseNumber(){
        return number;
    }
    
    public int getCoursePrice(){
        return price*credits;
        
    }
    public int getCredits(){
        return credits;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Course{" + "number=" + number + ", name=" + name + '}';
    }
    
}
