/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee;

/**
 *
 * @author User
 */
public class Employee {

    private String firstName;
    private String surname;
    private String PPSN;
    private String role;
    private int employeeID;
    protected double wallet;

    //Constructor to an specific Employee
    public Employee(String firstName, String surname, String PPSN, String role, int employeeID) {
        this.firstName = firstName;
        this.surname = surname;
        this.PPSN = PPSN;
        this.role = role;
        this.employeeID = employeeID;
        this.wallet = 0;
    }

    public String work() {
        return this.firstName + "is working now.";
    }

    //Getters and Setters that I can change 
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    //I cant change it, so I'm just creating Getters
    public String getPPSN() {
        return PPSN;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * Create a formatted version of the Employee details
     *
     * @return formatted version as a String
     */
    @Override
    public String toString() {

        String formattedDetails = "\n **** EMPLOYEE ID " + this.getEmployeeID()
                + "\n\t" + this.firstName + " " + this.surname
                + "\n\t" + " Position: " + this.getRole();

        return formattedDetails;
    }

}
