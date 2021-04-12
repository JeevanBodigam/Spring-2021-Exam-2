/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8;

/**
 *
 * @author Jeevan Bodigam
 */
public class DellProcessor extends Processor {

    @Override
    public long processingTime() {
        return 100000;
        //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args){
        Processor proc=new DellProcessor();
        System.out.println(proc.processingTime()+" nanoseconds");
    }

}
