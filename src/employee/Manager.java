/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author User
 */
public class Manager extends Employee{
    
    public Manager(String firstName, String surname, String PPSN, int employeeID) {
        super(firstName, surname, PPSN, "Manager", employeeID);
        this.wallet = 50;
    }
    
    @Override
    public String work(){
        return this.getFirstName() + " is getting other people to do the work.";
    }
    
}
