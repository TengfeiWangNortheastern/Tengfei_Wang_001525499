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
 * @author 主子
 */
public class EncounterHistory {
    private List<Encounter> encounterList;

    public EncounterHistory() {
        this.encounterList=new ArrayList<Encounter>();
    }

    public List<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(List<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    public Encounter newEncounter(){
        Encounter newEncounter=new Encounter();
        encounterList.add(newEncounter);
        return newEncounter;
    }
    public void deleteEncounter(Encounter encounter){
        this.encounterList.remove(encounter);
    }
}
