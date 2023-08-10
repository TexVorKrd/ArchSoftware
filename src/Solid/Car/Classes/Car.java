package Solid.Car.Classes;

import java.awt.*;

public abstract class Car {
    private String maker;
    private String model;
    private Color color;
    private TypeGearBox gearBox;
    private TypeCar typeCar;
    private short numberWheels;
    private TypeFuel typeFuel;
    private float engCap;

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeGearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(TypeGearBox gearBox) {
        this.gearBox = gearBox;
    }

    public TypeCar getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(TypeCar typeCar) {
        this.typeCar = typeCar;
    }

    public short getNumberWheels() {
        return numberWheels;
    }

    public void setNumberWheels(short numberWheels) {
        this.numberWheels = numberWheels;
    }

    public TypeFuel getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(TypeFuel typeFuel) {
        this.typeFuel = typeFuel;
    }

    public float getEngCap() {
        return engCap;
    }

    public void setEngCap(float engCap) {
        this.engCap = engCap;
    }

    public Car(String maker, String model, Color color, TypeGearBox gearBox, TypeCar typeCar, short numberWheels, TypeFuel typeFuel, float engCap) {
        this.maker = maker;
        this.model = model;
        this.color = color;
        this.gearBox = gearBox;
        this.typeCar = typeCar;
        this.numberWheels = numberWheels;
        this.typeFuel = typeFuel;
        this.engCap = engCap;
    }

    public void movement(){

    }

    public void maintaince(){

    }

    public abstract int gearShift(int gear);


    public boolean swtLight(){
        return true;
    }

    public boolean swtWhip(){
        return true;
    }
}
