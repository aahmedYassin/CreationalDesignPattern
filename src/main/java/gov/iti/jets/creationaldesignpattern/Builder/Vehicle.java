/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.iti.jets.creationaldesignpattern.Builder;

/**
 *
 * @author Ahmed Yassin
 */
public class Vehicle {

    //reuqired parameters
    private String engine;
    private int speed;

    //optiional parameters
    private int airbage;
    
    private Vehicle(VehicleBuilder vehicleBuilder) {
        this.engine = vehicleBuilder.engine;
        this.speed = vehicleBuilder.speed;
        this.airbage = vehicleBuilder.airbage;
    }
    
    public String getEngine() {
        return engine;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public int getAirbage() {
        return airbage;
    }
    
    public static class VehicleBuilder {

        //reuqired parameters
        private String engine;
        private int speed;

        //optiional parameters
        private int airbage;

        
        public VehicleBuilder(String engine, int speed) {
            this.engine = engine;
            this.speed = speed;
        }
        
        public VehicleBuilder setAirbage(int airbag) {
            this.airbage = airbag;
            
            return this;
        }
      
        
        public Vehicle build() {
            
            return new Vehicle(this);
        }
        
    }

    @Override
    public String toString() {
        return "Vehicle{" + "engine=" + engine + ", speed=" + speed + ", airbage=" + airbage + '}';
    }
    
    
    
}
