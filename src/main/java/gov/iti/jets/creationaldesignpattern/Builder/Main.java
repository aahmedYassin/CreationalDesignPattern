package gov.iti.jets.creationaldesignpattern.Builder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author Ahmed Yassin
 */
public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle.VehicleBuilder("bmw", 100).setAirbage(5).build();
        Vehicle bike = new Vehicle.VehicleBuilder("toyota", 200).build();
        System.out.println(vehicle.toString());
        System.out.println(bike.toString());
        
       

    }

}
