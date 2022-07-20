package ru.itsjava.domain;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class Car {
    private final String brand;
    private final String model;
    private final int power;
}
