package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import ru.itsjava.domain.Car;
import ru.itsjava.domain.Client;

import java.util.Scanner;

@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final Client client;
    private final Scanner scanner;
    private final CarService carService;

    @Override
    public void rentСar() {
        System.out.println("Введите желаемый автомобиль для аренды:");
        System.out.println("Бренд");
        String brand = scanner.next();
        System.out.println("Модель");
        String model = scanner.next();
        if (carService.hasCar(brand, model)) {
            System.out.println("Оформление аренды ...");
            carService.takeCarByName(brand, model);
            System.out.println("Аренда автомобиля оформленна: " + brand + " " + model);
        } else {
            System.out.println("Аренда невозможна... Автомобиля нет в наличии");
        }
    }

    @Override
    public void returnСar() {
        System.out.println("Введите бренд автомобиля для возврата");
        String brand = scanner.next();

        System.out.println("Введите модель автомобиля для возврата");
        String model = scanner.next();

        System.out.println("Введите мощность автомобиля для возврата");
        int power = scanner.nextInt();

        Car car = new Car(brand, model, power);
        carService.putCar(car);
    }

    @Override
    public void printCars() {
        System.out.println("Уважаемый " + client.getName());
        System.out.println("Вот наши автомобили: ");
        carService.printCars();
    }
}
