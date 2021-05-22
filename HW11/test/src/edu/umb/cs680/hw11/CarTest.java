package edu.umb.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    private String[] carToStringArray(Car car) {
        String[] carInfo = {car.getModel(),car.getMake(),Integer.toString(car.getYear())};
        return carInfo;
    }

    @Test
    public void CarEqualityTest1() {
        String[] expected = {"abc", "defg", "2010"};
        Car actual = new Car("abc", "defg", 500, 2010, 2000);
        assertArrayEquals(expected, carToStringArray(actual));
    }

}