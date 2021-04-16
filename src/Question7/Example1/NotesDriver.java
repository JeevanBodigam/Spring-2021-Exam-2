/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7.Example1;

/**
 *
 * @author Jeevan Bodigam
 */
public class NotesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("The total types of books are: "
                + NotesEnum.values().length);

        System.out.println("The different types of notes are: ");
        for (int i = 0; i < NotesEnum.values().length; i++) {
            System.out.println(NotesEnum.values()[i]);
        }
    }

}
