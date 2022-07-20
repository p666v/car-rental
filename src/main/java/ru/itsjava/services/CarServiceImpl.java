package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Car;

import java.util.List;

@RequiredArgsConstructor
public class CarServiceImpl implements CarService {
    private final List<Car> carFromStore;

    @Override
    public Car takeCarByName(String brand, String model) {
        Car resCar = null;

        for (Car car : carFromStore) {
            if (car.getBrand().equals(brand) && car.getModel().equals(model)) {
                resCar = car;
            }
        }

        if (resCar != null) {
            carFromStore.remove(resCar);
            return resCar;
        }

        return null;
    }

    @Override
    public void putCar(Car car) {
        carFromStore.add(car);
    }

    @Override
    public boolean hasCar(String brand, String model) {
        for (Car car : carFromStore) {
            if (car.getBrand().equals(brand) && car.getModel().equals(model)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void printCars() {
        for (Car car : carFromStore) {
            System.out.println(car.getBrand() + " " + car.getModel() + " " + car.getPower());
        }
    }
}
