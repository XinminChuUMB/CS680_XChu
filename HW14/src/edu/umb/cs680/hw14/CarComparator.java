package edu.umb.cs680.hw14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CarComparator {

    private static ArrayList<Car> cars = new ArrayList<>();

    public static void init() {
        cars.add(new Car("A1", "M1", 10059, 2015, 8000));
        cars.add(new Car("A2", "M2", 20000, 2010, 7005));
        cars.add(new Car("A3", "M3", 3000, 2020, 13880));
        cars.add(new Car("A4", "M4", 185000, 2000, 300));
    }

    public void MileageCompare() {
        Collections.sort(cars, Comparator.comparing((Car car) -> car.getMileage()));
        String[] sortCarMileage = {String.valueOf(cars.get(0).getMileage()),
                String.valueOf(cars.get(1).getMileage()),
                String.valueOf(cars.get(2).getMileage()),
                String.valueOf(cars.get(3).getMileage())};
        System.out.println(sortCarMileage);

        String[] sortCarPrice = {String.valueOf(cars.get(0).getPrice()),
                String.valueOf(cars.get(1).getPrice()),
                String.valueOf(cars.get(2).getPrice()),
                String.valueOf(cars.get(3).getPrice())};
        System.out.println(sortCarPrice);

    }




}

