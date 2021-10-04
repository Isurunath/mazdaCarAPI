package com.mazda.car.service;

import com.mazda.car.entity.Car;

import java.util.List;
import java.util.Optional;

public interface CarService {
    public List<Car> getAllCarDetails();
    public Optional<Car> getCarById(int Id);
    public Optional<Car> getCarByPlate(String plateNo);
    public Car saveCar(Car c);
    public Car updateCar(Car c);
}
