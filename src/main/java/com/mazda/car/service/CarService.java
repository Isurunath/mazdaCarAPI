package com.mazda.car.service;

import com.mazda.car.entity.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAllCarDetails();
    public Car saveCar(Car c);
    public Car updateCar(Car c);
}
