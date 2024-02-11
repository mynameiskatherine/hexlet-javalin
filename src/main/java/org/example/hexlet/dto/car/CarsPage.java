package org.example.hexlet.dto.car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.hexlet.model.Car;

import java.util.List;

@AllArgsConstructor
@Getter
public class CarsPage {
    private List<Car> cars;
}
