/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Order.FoodCatalog;
import Business.Order.MasterOrderList;
import Business.Order.Order;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private FoodCatalog foodCatalog;
    private MasterOrderList masterOrderList;

    public MasterOrderList getMasterOrderList() {
        return masterOrderList;
    }

    public void setMasterOrderList(MasterOrderList masterOrderList) {
        this.masterOrderList = masterOrderList;
    }
    public WorkQueue() {
        workRequestList = new ArrayList();
        foodCatalog=new FoodCatalog();
        masterOrderList=new MasterOrderList();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public FoodCatalog getFoodCatalog() {
        return foodCatalog;
    }

    public void setFoodCatalog(FoodCatalog foodCatalog) {
        this.foodCatalog = foodCatalog;
    }
    

    public void setWorkRequestList(ArrayList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }
    public void removeWorkRequest(WorkRequest workRequest){
        workRequestList.remove(workRequest);
    }
}