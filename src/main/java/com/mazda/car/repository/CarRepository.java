package com.mazda.car.repository;

import com.mazda.car.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer>{

    public Optional<Car> findByplateNo(String name);

}
