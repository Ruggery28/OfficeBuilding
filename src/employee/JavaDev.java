/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author User
 */
public class JavaDev extends Employee {
    
    public JavaDev(String firstName, String surname, String PPSN, int employeeID) {
        super(firstName, surname, PPSN, "Java Dev", employeeID);
    }
    
    @Override
    public String work(){
        return this.getFirstName() + " is debbuging some broken code. ";
    }
    
}
