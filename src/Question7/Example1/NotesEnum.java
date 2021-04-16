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
public enum NotesEnum {
    STICKYNOTES(50), CLASSNOTES(300), DIARY(250), NOTEPAD(100);
    private int noOfPages;

    private NotesEnum(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public int getNoOfPages() {
        return noOfPages;
    }
}
