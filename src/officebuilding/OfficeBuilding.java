/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package officebuilding;

import inpututils.InputUtils;

/**
 *
 * @author User
 */
public class OfficeBuilding {

    private int numFloors;
    private String address;
    private Company[] companyList;

    public OfficeBuilding(int numFloors, String address) {
        this.numFloors = numFloors;
        this.address = address;
        this.companyList = new Company[numFloors]; // 1 company per floor
    }

    public void generateCompanies() {

        InputUtils myInput = new InputUtils();

        for (int i = 0; i < companyList.length; i++) {

            String cName = myInput.askUserForText("What is the name of the company on floor " + (i + 1));
            String owner = myInput.askUserForText("Who owns this company?");

            Company someCompany = new Company(cName, owner);    //makes 1 company

            companyList[i] = someCompany;

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        InputUtils myInput = new InputUtils();

        String address = myInput.askUserForText("What is the address for this building?");
        int floors = myInput.askUserForInt("How many floors in the building?", 10);

        OfficeBuilding myBuilding = new OfficeBuilding(floors, address); //makes a new building
        myBuilding.generateCompanies();

        //get all companies to hire some staff
        for (int c = 0; c < myBuilding.companyList.length; c++) {

            int numStaff = myInput.askUserForInt("How many staff do you wish to hire?");
            myBuilding.companyList[c].hireStaff(numStaff);
            System.out.println(myBuilding.companyList[c].listAllStaff());
        }

    }

}
