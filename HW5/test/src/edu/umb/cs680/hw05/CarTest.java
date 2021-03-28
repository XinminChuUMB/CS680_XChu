package edu.umb.cs680.hw05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    private String[] carToStringArray(Car car) {
        return new String[]{ car.getMake(), car.getModel(), Integer.toString(car.getYear())};
    }

    @Test
    public void verifyCarEqualityWithMakeModelYear() {
        String[] expected1 = { "Toyota", "RAV4", "2018" };
        Car car1 = new Car( "Toyota", "RAV4", 30000, 2018, 6500f );
        assertArrayEquals(expected1, carToStringArray(car1));

        String[] expected2 = {"Jeep", "Compass", "2017"};
        Car car2 = new Car("Jeep", "Compass", 85000, 2017, 13500f);
        assertArrayEquals(expected2, carToStringArray(car2));
    }

}