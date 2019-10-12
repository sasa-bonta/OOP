package com.company;

public class Auto extends Vehicle {
    private int passengersSeats;
    private int power;
    private String fuelsType;

    // Constructor
    Auto(double Weight, int passengersSeats, int power, String fuelsType) {
        super(Weight);
        this.passengersSeats = passengersSeats;
        this.power = power;
        this.fuelsType = fuelsType;
    }

    // getters
    public int getPassengersSeats() {
        return this.passengersSeats;
    }

    public int getPower() {
        return this.power;
    }

    public String getFuelsType() {
        return this.fuelsType;
    }

    // setters
    public void setPassengersSeats(int passengersSeats) {
        this.passengersSeats = passengersSeats;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setFuelsType(String fuelsType) {
        this.fuelsType = fuelsType;
    }

}

