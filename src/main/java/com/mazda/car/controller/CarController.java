package com.mazda.car.controller;

import com.mazda.car.entity.Car;
import com.mazda.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/car")
@CrossOrigin(origins = "http://localhost:4200")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/getall")
    public List<Car> getAllCarDetails(){
        return carService.getAllCarDetails();
    }

    @GetMapping("/{id}")
    public Optional<Car> getCarById(@PathVariable("id") int Id){
        return carService.getCarById(Id);
    }

    @GetMapping("/plate/{plateNo}")
    public Optional<Car> getCarByPlate(@PathVariable("plateNo") String plateNo){ return carService.getCarByPlate(plateNo);
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
