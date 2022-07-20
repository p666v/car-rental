package ru.itsjava.services;

import ru.itsjava.domain.Car;

public interface CarService {
    Car takeCarByName(String brand, String model);

    void putCar(Car car);

    boolean hasCar(String brand, String model);

    void printCars();
}
