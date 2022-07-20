package ru.itsjava.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.itsjava.domain.Car;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarServiceImplTest {
    private final String DEFAULT_BRAND = "Audi";
    private final String DEFAULT_MODEL = "Q5";
    private final int DEFAULT_POWER = 370;

    List<Car> carList = new ArrayList<>();

    @DisplayName("Проверка метода takeCarByName")
    @Test
    public void shouldCorrectMethodTakeCarByName() {

        Car actualCar = new Car(DEFAULT_BRAND, DEFAULT_MODEL, DEFAULT_POWER);
        carList.add(actualCar);
        CarServiceImpl carService = new CarServiceImpl(carList);
        assertEquals(actualCar, carService.takeCarByName(DEFAULT_BRAND,DEFAULT_MODEL));
    }

    @Test
    @DisplayName("Проверка метода putCar")
    public void shouldCorrectMethodPutCar() {
        Car actualCar = new Car(DEFAULT_BRAND, DEFAULT_MODEL, DEFAULT_POWER);
        CarServiceImpl carService = new CarServiceImpl(carList);
        carService.putCar(actualCar);
        assertEquals(actualCar, carList.get(0));
    }

    @Test
    @DisplayName("Проверка метода hasCar")
    public void shouldCorrectMethodHasCar() {
        Car actualCar = new Car(DEFAULT_BRAND, DEFAULT_MODEL, DEFAULT_POWER);
        carList.add(actualCar);
        CarServiceImpl carService = new CarServiceImpl(carList);
        assertTrue(carService.hasCar(DEFAULT_BRAND,DEFAULT_MODEL));
    }

    @DisplayName("Проверка метода printCars")
    @Test
    public void shouldCorrectMethodPrintCars() {
        Car actualCar = new Car(DEFAULT_BRAND, DEFAULT_MODEL, DEFAULT_POWER);
        carList.add(actualCar);
        assertEquals(actualCar, carList.get(0));

    }
}
