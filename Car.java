/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Com;

/**
 *
 * @author Naviank
 */
public class Car implements Comparable<Car> {
    String carID, color, frameID, engineID;
    Brand brand;

    public Car() {
    }

    public Car(String carID, String color, String frameID, String engineID, Brand brand) {
        this.carID = carID;
        this.color = color;
        this.frameID = frameID;
        this.engineID = engineID;
        this.brand = brand;
    }

    public String getCarID() {
        return carID;
    }

    public void setCarID(String carID) {
        this.carID = carID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFrameID() {
        return frameID;
    }

    public void setFrameID(String frameID) {
        this.frameID = frameID;
    }

    public String getEngineID() {
        return engineID;
    }

    public void setEngineID(String engineID) {
        this.engineID = engineID;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return carID + ", " + brand.brandID + ", " + color + ", " + frameID +", " + engineID;
    }

    public String screenString() {
        return brand + "\n" + carID + ", " + color + ", " + frameID +", " + engineID;
    }    
    
    @Override
    public int compareTo(Car o) {
        int d = this.brand.brandName.compareTo(o.brand.brandName);
        if (d != 0) {
            return d;
        }
        else 
            return this.carID.compareTo(o.carID); 

    }
    
}
