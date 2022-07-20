package ru.itsjava.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class Client {
    private final String name;
    private final List<Car> carsList;
}
