/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organizations;

import Business.Role.Role;
import Business.Role.SuperAdminRole;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author NURES
 */
public class SuperAdminOrganization extends Organization{
     public SuperAdminOrganization() {
        super(Organization.Type.SuperAdmin.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new SuperAdminRole());
        return roles;
    }
}
