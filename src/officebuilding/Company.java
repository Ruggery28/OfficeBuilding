/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package officebuilding;

import employee.Employee;

/**
 *
 * @author User
 */
public class Company {

    public String companyName;
    public String owner;
    public Employee staffList;

    public Company(String companyName, String owner) {
        this.companyName = companyName;
        this.owner = owner;
        staffList = hireStaff();
    }

    private Employee hireStaff() {
        
        return null; //to be updated
    }

}
