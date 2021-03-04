/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Map;
import model.Comment;
import model.Post;
import model.User;

/**
 *
 * @author NURES
 */
public class DataStore {

    public static Object getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private Map<Integer,User> users;
    private Map<Integer,Post> posts;
    private Map<Integer,Comment> comments;
    
}
