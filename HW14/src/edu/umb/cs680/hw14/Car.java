
package edu.umb.cs680.hw14;
import java.util.ArrayList;

public class Car {
    private String make, model;
    private int mileage, year;
    private float price;
    private int dominationCount;

    public Car(String make, String model, int mileage, int year, float price) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.year = year;
        this.price = price;
    }

    public void setDominationCount(ArrayList<Car> usedCars){
        int count = 0;
        for(Car car: usedCars) {
            if (car.getYear() <= this.getYear() &&
                    car.getMileage() >= this.getMileage() &&
                    car.getPrice() >= this.getPrice()) {
                if (car.getYear() < this.getYear() ||
                        car.getMileage() > this.getMileage() ||
                        car.getPrice() > this.getPrice()) {
                    count ++;
                }
            }
        }
        this.dominationCount = count;
    }

    public int getDominationCount(){
        return this.dominationCount;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getMileage() {
        return this.mileage;
    }

    public int getYear() {
        return this.year;
    }

    public float getPrice() {
        return this.price;
    }

}