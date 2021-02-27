/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2.part4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 主子
 */
public class PersonDirectory {
    private int count=1;
    private List<Person> personList;

    public PersonDirectory() {
        personList=new ArrayList<Person>();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
    public Person newPerson(){
        Person newPerson=new Person();
        newPerson.setId(count++);
        personList.add(newPerson);
        return newPerson;
    }
    public Person newPerson(String fir,String sec,int a){
        Person newPerson=new Person(fir,sec,a);
        newPerson.setId(count++);
        personList.add(newPerson);
        return newPerson;
    }
    public void addPerson(Person person){
        if(!personList.contains(person)){            
            person.setId(count++);
            personList.add(person);
        }
    }
    public Person findPerson(String name){
        for(Person p : personList){
            if(name.equals(p.getFullName())){
                return p;
            }
        }
        return null;
    }
    public Person findPerson(int id){
        for(Person p : personList){
            if(id==p.getId()){
                return p;
            }
        }
        return null;
    }
}
