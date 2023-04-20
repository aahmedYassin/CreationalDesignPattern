package gov.iti.jets.creationaldesignpattern.factory;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author Ahmed Yassin
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Vehicle car = VehicleFactory.getInstance("car", 100, "bmw");
        Vehicle bike = VehicleFactory.getInstance("bike", 200, "abc");

        System.out.println(car.getData());
        System.out.println(bike.getData());

    }

}
