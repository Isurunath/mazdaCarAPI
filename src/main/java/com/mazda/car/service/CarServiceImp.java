package com.mazda.car.service;

import com.mazda.car.entity.Car;
import com.mazda.car.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImp implements CarService{

    @Autowired
    CarRepository carRepository;

    @Override
    public List<Car> getAllCarDetails() {
        return carRepository.findAll();
    }

    @Override
    public Optional<Car> getCarById(int Id) {
        return carRepository.findById(Id);
    }

    @Override
    public Optional<Car> getCarByPlate(String plateNo) {
        return carRepository.findByplateNo(plateNo);
    }

    @Override
    public Car saveCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public Car updateCar(Car car) {
        Optional<Car> temp = carRepository.findById(car.getId());
        if(temp.isPresent()){
            Car newCar =temp.get();
            newCar.setModel(car.getModel());
            newCar.setYearManufactured(car.getYearManufactured());
            newCar.setColor(car.getColor());
            newCar.setEngineTransmission(car.getEngineTransmission());
            newCar.setPlateNo(car.getPlateNo());

            return carRepository.save(newCar);
        }

        return null;
    }
}
