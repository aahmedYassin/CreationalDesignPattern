/*
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.iti.jets.creationaldesignpattern.factory;

/**
 *
 * @author Ahmed Yassin
 */
public class Bike extends Vehicle {

    private String type;

    private int price;

    public Bike(String type, int price) {
        this.type = type;
        this.price = price;
    }

    @Override
    String getType() {
        return type;

    }

    @Override
    int getPrice() {
        return price;

    }

}
