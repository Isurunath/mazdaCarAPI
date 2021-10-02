package com.mazda.car.entity;

import javax.persistence.*;

@Entity
@Table(name = "car" )
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "model", nullable = false, length =15)
    private String model;

    @Column(name = "yearManufactured", nullable = false, length =4)
    private int yearManufactured;

    @Column(name = "color", nullable = false, length =10)
    private String color;

    @Column(name = "engineTransmission", nullable = false, length =6)
    private String engineTransmission;

    @Column(name = "plateNo", unique = true, nullable = false, length =10)
    private String plateNo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearManufactured() {
        return yearManufactured;
    }

    public void setYearManufactured(int yearManufactured) {
        this.yearManufactured = yearManufactured;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngineTransmission() {
        return engineTransmission;
    }

    public void setEngineTransmission(String engineTransmission) {
        this.engineTransmission = engineTransmission;
    }

    public String getPlateNo() {
        return plateNo;
    }

    public void setPlateNo(String plateNo) {
        this.plateNo = plateNo;
    }
}
