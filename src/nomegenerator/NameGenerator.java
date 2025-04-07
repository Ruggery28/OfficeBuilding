/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nomegenerator;

import java.util.Random;

/**
 *
 * @author User
 */
public class NameGenerator {

    protected String[] firstNames = {"Ken", "Tom", "Sally", "Pavel", "Priscilla", "Claudia", "Steffany", "Sarah", "Fabio", "Danilo"};

    protected String[] surnames = {"Murphy", "Silva", "Smith", "Jones", "Carvalho", "Ernst", "Conceicao", "Haider", "Oliviera"};

    public NameGenerator() {

        //nothing here - deliberate
    }

    /**
     * Generates a random name using firstnames and surnames
     *
     * @return the name as a String
     */
    public String getRandomName() {

        Random r = new Random();

        //pick a firstname and surname based on length of array
        String fname = this.firstNames[r.nextInt(firstNames.length)];
        String sname = this.surnames[r.nextInt(surnames.length)];

        return (fname + " " + sname);

    }

}
