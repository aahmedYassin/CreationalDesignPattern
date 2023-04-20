/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.iti.jets.creationaldesignpattern.factory;

/**
 *
 * @author Ahmed Yassin
 */
public abstract class Vehicle {

    abstract String getType();

    abstract int getPrice();

    public Vehicle() {

    }

    public String getData() {

        return "Type is " + getType() + " price = " + getPrice();

    }

}
