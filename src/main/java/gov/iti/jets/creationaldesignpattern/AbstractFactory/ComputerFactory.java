/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.iti.jets.creationaldesignpattern.factory.AbstractFactory;

/**
 *
 * @author Ahmed Yassin
 */
public class ComputerFactory {
    
    public static Computer createComputer(ComputerAbstractFctory computerAbstractFctory){
    
        return computerAbstractFctory.createComputer();
    }
}
