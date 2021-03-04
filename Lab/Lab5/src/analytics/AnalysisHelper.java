/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analytics;

import data.DataStore;
import java.util.Map;
import model.Comment;

/**
 *
 * @author NURES
 */
public class AnalysisHelper {
    
    public void getAverageLikesPerComments(){
        Map<Integer,Comment> comments=DataStore.getInstance().getComments();
    }
}
