/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.iti.jets.creationaldesignpattern.factory;

/**
 *
 * @author Ahmed Yassin
 */
public class VehicleFactory {

    public static Vehicle getInstance(String name, int price, String type) {

        if (name.toLowerCase().equals("car")) {

            return new Car(type, price);
        } else if (name.toLowerCase().equals("bike")) {

            return new Bike(type, price);
        }

        return null;

    }

}
