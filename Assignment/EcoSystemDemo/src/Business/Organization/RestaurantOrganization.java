/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminRole;
import Business.Role.RestaurantManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author NURES
 */
public class RestaurantOrganization extends Organization{

    public RestaurantOrganization() {
        super(Organization.Type.RestaurantAdmin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RestaurantManagerRole());
        return roles;
    }
    
}
