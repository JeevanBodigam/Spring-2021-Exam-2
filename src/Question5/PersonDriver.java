/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.Date;

/**
 *
 * @author Jeevan Bodigam
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date d = new Date();
        Person personObj = new Person("Jeevan", "Maryville",
                660528386, "j@gmail.com");
        Student stuObj = new Student(9.4, "Vasavi", "Maryville",
                909090909, "v@gmail.com");
        Employee empObj = new Employee("Northwest", 12000, d, "Kosuhik",
                "Maryville", 123456, "k@gmail.com");
        Staff staffObj = new Staff("Assistant", "Libarary", 12000, d,
                "Raghu", "MAryville", 89898989, "r@gmail.com");
        Faculty facObj = new Faculty(12, 3, "Colden Hall", 100000, d,
                "Badami Bandi", "Northwest", 787878787, "bb@gmail.com");

        System.out.println(personObj);
        System.out.println(stuObj);
        System.out.println(empObj);
        System.out.println(staffObj);
        System.out.println(facObj);
    }

}
