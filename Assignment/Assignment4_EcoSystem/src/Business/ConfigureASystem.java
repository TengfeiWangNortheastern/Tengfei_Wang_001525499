package Business;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organizations.CustomerOrganization;
import Business.Organizations.DeliveryManOrganization;
import Business.Organizations.Organization;
import Business.Organizations.RestaurantOrganization;
import Business.Organizations.SystemAdminOrganization;
import Business.Role.SuperAdminRole;
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
        
        Network network=system.createAndAddNetwork();
        
        Enterprise enterprise=network.getEnterpriseDirectory().createAndAddEnterprise("Restaurant", Enterprise.EnterpriseType.Hospital);
        
        Organization organization1=enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Customer);
        enterprise.getOrganizationDirectory().createOrganization(Organization.Type.DeliveryMan);
        enterprise.getOrganizationDirectory().createOrganization(Organization.Type.RestaurantAdmin);
        enterprise.getOrganizationDirectory().createOrganization(Organization.Type.SysAdmin);
        enterprise.getOrganizationDirectory().createOrganization(Organization.Type.SuperAdmin);

//        organization1
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        Employee employee1=system.getEmployeeDirectory().createEmployee("Super");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        UserAccount ua1 = system.getUserAccountDirectory().createUserAccount("sys", "sys", employee, new SuperAdminRole());

        return system;
    }
    
}
