package OOP_Nasledovanie;

import java.awt.*;

public class Zadanie1 {
    public static void main(String[] args) {
        Toyota t1 = new Toyota("Toyota", "camry" ,120,1000,12,"Japan");
        Toyota t2 = new Toyota("Toyota", "avensis" ,150,2000,12,"Europe");
        Toyota t3 = new Toyota("Toyota", "l200" ,120,1000,12,"USA");
        Toyota t4 = new Toyota("Toyota", "l100" ,120,1000,12,"United Arabian Emirates");

        Mers m1 = new Mers("Mersedex", "avensis" ,150,2000,12,"E Class");
        Mers m2 = new Mers("Mersedex", "avensis" ,150,2000,12,"S Class");
        Mers m3 = new Mers("Mersedex", "avensis" ,150,2000,12,"D Class");
        Mers m4 = new Mers("Mersedex", "avensis" ,150,2000,12,"G Class");
        Car cars[] = {t1,t2,t3,t4,m1,m2,m3,m4};
        for (int i = 0; i < cars.length; i++) {
            cars[i].ride();
        }
    }
}

class Car {
    protected String name;
    protected String model;
    protected int maxSpeed;
    protected int year;
    protected double volume;

    public Car() {

    }
    public Car(String name, String model, int maxSpeed, int year, double volume) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.year = year;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    public void ride() {
        System.out.println(getName() + " " + getModel() + " " + getMaxSpeed() + " " + getYear() + " " + getVolume() + " is riding");
    }

}
class Toyota extends Car{
    protected String  manufacturer;

    public Toyota() {

    }

    public Toyota(String name, String model, int maxSpeed, int year, double volume, String manufacturer) {
        super(name, model, maxSpeed, year, volume);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
     public void ride() {
         System.out.println(name + " " + getModel() + " " + getMaxSpeed() + " " + getYear() + " " + getVolume() + " " + manufacturer + " is riding");
     }
}

class Mers extends Car {
    protected String classType;

    public Mers() {

    }

    public Mers(String name, String model, int maxSpeed, int year, double volume, String classType) {
        super(name, model, maxSpeed, year, volume);
        this.classType = classType;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }
    public void ride() {
        System.out.println(getName() + " " + getModel() + " " + getMaxSpeed() + " " + getYear() + " " + getVolume() + " " + getClassType() + " is riding");
    }
}


