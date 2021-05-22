package edu.umb.cs680.hw11;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class MileageComparatorTest {
    private static ArrayList<Car> cars = new ArrayList<>();

    @BeforeAll
    public static void init() {
        cars.add(new Car("abc", "defg", 500, 2010, 2000));
        cars.add(new Car("Jeep", "Compass", 2000, 2002, 77667));
    }

    @Test
    public void MileageCompareTest() {
        String[] expected = {"abc", "Jeep"};
        Collections.sort(cars, new MileageComparator());
        String[] actual = carsToStringArray(cars);
        assertArrayEquals(expected, actual);
    }

    private String[] carsToStringArray(ArrayList<Car> cars) {
        String[] carsModel =  new String[cars.size()];
        for (int i = 0; i < cars.size(); i++) {
            carsModel[i] = cars.get(i).getModel();
        }
        return carsModel;
    }
}