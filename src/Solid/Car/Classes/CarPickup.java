package Solid.Car.Classes;

import java.awt.*;


public class CarPickup extends Car implements IRefueling {

    private int loadCapacity;


    @Override
    public void fuel() {

    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public CarPickup(String maker, String model, Color color, TypeCar typeCar, short numberWheels, TypeFuel typeFuel, float engCap, int loadCapacity) {
        super(maker, model, color, typeCar, numberWheels, typeFuel, engCap);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public int gearShift(int gear) {
        return 0;
    }
}
