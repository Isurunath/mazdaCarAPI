package com.mazda.car.controller;

import com.mazda.car.entity.Car;
import com.mazda.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/getall")
    public List<Car> getAllCarDetails(){
        return carService.getAllCarDetails();
    }

    @PostMapping("/savecar")
    public Car saveCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @PutMapping("/updatecar")
    public Car updateCar(@RequestBody Car car) {
        return carService.updateCar(car);
    }
}
