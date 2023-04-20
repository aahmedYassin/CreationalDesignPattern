/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.iti.jets.creationaldesignpattern.factory.AbstractFactory;

/**
 *
 * @author Ahmed Yassin
 */
public class PcFactory  implements  ComputerAbstractFctory{

     private String ram;
    private String cpu;
    private String hdd;

    public PcFactory(String ram, String cpu, String hdd) {
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }
    @Override
    public Computer createComputer() {
        
        return new PC(ram,cpu,hdd);
           
       
     }
    
}
