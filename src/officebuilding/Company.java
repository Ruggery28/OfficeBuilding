/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package officebuilding;

import employee.*;
import inpututils.InputUtils;
import java.util.ArrayList;
import java.util.Random;
import nomegenerator.NameGenerator;

/**
 *
 * @author User
 */
public class Company {

    public String companyName;
    public String owner;
    public ArrayList<Employee> staffList; //this need to be fixed
    private int nextAvailableID;

    public Company(String companyName, String owner) {
        this.companyName = companyName;
        this.owner = owner;

        this.nextAvailableID = 1001;
        this.staffList = new ArrayList<Employee>();
    }

    public void hireStaff(int howManyStaff) {

        NameGenerator ng = new NameGenerator();

        for (int e = 0; e < howManyStaff; e++) {

            // randomly create an employee name
            String randomName = ng.getRandomName();

            String[] name = randomName.split(" ");

            String fname = name[0];
            String sname = name[1];

            int id = createEmpID();

            int jobNum = createJobTitle();
            Employee someEmployee = null;

            switch (jobNum) { //this is not great - need to fix it

                case 0: //JavaDev

                    someEmployee = new JavaDev(fname, sname, "12345", id);
                    break;
                case 1: //Manager

                    someEmployee = new Manager(fname, sname, "12345", id);
                    break;
                case 2: //Receptionist

                    someEmployee = new Receptionist(fname, sname, "12345", id);
                    break;
                case 3: //SecurityAnalyst

                    someEmployee = new SecurityAnalyst(fname, sname, "12345", id);
                    break;

                default:
                    System.out.println("INVALID JOB TITLE SELECTED");
            }

            staffList.add(someEmployee); // add employee to the staff list
        }
    }

    /**
     * Creates an employee ID - also makes sue that the same ID cannot be used
     * twice
     *
     * @return unique ID as an int
     */
    private int createEmpID() {

        int nextID = this.nextAvailableID;
        this.nextAvailableID++;     //make sure I cannot use same ID twice

        return nextID;

    }

    /**
     * Randomly select a job from the possible list of jobs
     *
     * @return the job selected
     */
    private int createJobTitle() {

        Random r = new Random();

        int jobnum = r.nextInt(4);   // BAD PROGRAMMING - I WILL NEED TO FIX THIS

        return jobnum;
    }

    public String listAllStaff() {

        String formattedList = "";

        for (Employee e : staffList) {

            formattedList = formattedList + e.toString();
        }

        return formattedList;
    }

}
