package gov.iti.jets.creationaldesignpattern.factory.AbstractFactory;

import java.util.List;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author Ahmed Yassin
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Computer computer = ComputerFactory.createComputer(new PcFactory("hdd", "samsung", "123"));
        System.out.println(computer.getCPU());

    }

}
