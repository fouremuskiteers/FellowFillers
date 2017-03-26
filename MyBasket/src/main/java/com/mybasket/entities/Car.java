package com.mybasket.entities;

import java.math.BigInteger;

/**
 * Created by ssaha on 3/23/17.
 */
public class Car {
    private String make;
    private String model;
    private String registrationNumber;
    private String vinNumber;
    private BigInteger fuelCapacity;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public BigInteger getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(BigInteger fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }
}
