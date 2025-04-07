/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author User
 */
public class Receptionist extends Employee {

    public Receptionist(String firstName, String surname, String PPSN, int employeeID) {
        super(firstName, surname, PPSN, "Receptionist", employeeID);
    }

    @Override
    public String work() {
        return this.getFirstName() + " is dealing with custumers.";
    }
}
