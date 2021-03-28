package Business;

import Business.Employee.Employee;
import Business.Organizations.CustomerOrganization;
import Business.Organizations.DeliveryManOrganization;
import Business.Organizations.RestaurantOrganization;
import Business.Organizations.SystemAdminOrganization;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
//        CustomerOrganization customerOrganization = new CustomerOrganization();
//        system.getOrganizationDirectory().getOrganizationList().add(customerOrganization);
//        
//        DeliveryManOrganization deliveryManOrganization=new DeliveryManOrganization();
//        system.getOrganizationDirectory().getOrganizationList().add(deliveryManOrganization);
        
//        RestaurantOrganization restaurantOrganization=new RestaurantOrganization();
//        system.getOrganizationDirectory().getOrganizationList().add(restaurantOrganization);
        
//        SystemAdminOrganization systemAdminOrganization=new SystemAdminOrganization();
//        system.getOrganizationDirectory().getOrganizationList().add(systemAdminOrganization);
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        
        return system;
    }
    
}
