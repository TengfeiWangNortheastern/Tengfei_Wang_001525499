/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analytics;

import java.util.Comparator;
import java.util.HashMap;
import model.User;

/**
 *
 * @author NURES
 */
public class UserMapComparator implements Comparator<User>{
    HashMap<Integer, Integer> userPostMap;

    public UserMapComparator(HashMap<Integer,Integer> userPostMap) {
        this.userPostMap=userPostMap;
    }

    
    @Override
    public int compare(User o1, User o2) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        return o2.getComments().size()-o1.getComments().size();
        return Integer.compare(
                (userPostMap.get(o1.getId())==null)?0:userPostMap.get(o1.getId()),
                (userPostMap.get(o2.getId())==null)?0:userPostMap.get(o2.getId())
                        );
    }
    
}
