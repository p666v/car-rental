package ru.itsjava.services;

import lombok.RequiredArgsConstructor;

import java.util.Scanner;

@RequiredArgsConstructor
public class MenuServiceImpl implements MenuService {
    private final ClientService clientService;
    private final Scanner scanner;

    @Override
    public void menu() {
        while (true) {
            printMenu();
            System.out.println("Введите номер меню");
            int menuNum = scanner.nextInt();
            if (menuNum == 1) {
                System.out.println("Вы выбрали арендовать автомобиль");
                clientService.rentСar();
            } else if (menuNum == 2) {
                System.out.println("Вы выбрали вернуть автомобиль");
                clientService.returnСar();
            } else if (menuNum == 3) {
                System.out.println("Печатаем автомобили в наличии...");
                clientService.printCars();
            } else if (menuNum == 0) {
                System.out.println("До встречи");
                System.exit(0);
            }
            System.out.println("Введите номер меню");
            menuNum = scanner.nextInt();
        }
    }

    @Override
    public void printMenu() {
        System.out.println("Меню:\n" +
                "1. Арендовать\n" +
                "2. Вернуть\n" +
                "3. Вывод автомобилей\n" +
                "0. Выход\n");
    }
}
