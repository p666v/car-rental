package ru.itsjava.services;

import ru.itsjava.domain.Car;
import ru.itsjava.domain.Client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreServiceImpl implements StoreService {
    @Override
    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше ФИО");
        String clientName = scanner.next();

        Client client = new Client(clientName, new ArrayList<>());

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Mercedes", "C", 180));
        carList.add(new Car("Mercedes", "CLS", 270));
        carList.add(new Car("Mercedes", "GL", 500));
        carList.add(new Car("Mercedes", "A", 150));
        carList.add(new Car("BMW", "X3", 150));
        carList.add(new Car("BMW", "X5", 240));
        carList.add(new Car("BMW", "X6", 370));
        carList.add(new Car("Audi", "TT", 370));
        carList.add(new Car("Audi", "Q3", 350));
        carList.add(new Car("Audi", "RS6", 600));

        CarService carService = new CarServiceImpl(carList);

        ClientService clientService = new ClientServiceImpl(client, scanner, carService);

        MenuService menuService = new MenuServiceImpl(clientService, scanner);

        menuService.menu();
    }
}
