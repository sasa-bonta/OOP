package com.company;
//Exemple classa Parinte pentru classa Bike
class Vehicle {
    protected String Type;
    protected int wheelsQuantity;
    private double Weight;
    private int TopSpeed;


    //Constructor
    Vehicle(String Type, int Wheelsquantity, double Weight, int TopSpeed) {
        this.Type = Type;
        this.wheelsQuantity = Wheelsquantity;
        this.Weight = Weight;
        this.TopSpeed = TopSpeed;
    }

    Vehicle(double Weight, int TopSpeed) {
        this.Type = "Bicycle";
        this.wheelsQuantity = 2;
        this.Weight = Weight;
        this.TopSpeed = TopSpeed;
    }

    Vehicle(double Weight) {
        this.Type = "Autoturism";
        this.wheelsQuantity = 4;
        this.Weight = Weight;
        this.TopSpeed = 180;
    }

    //getters
    public String getType() {
        return this.Type;
    }

    public int getWheelsquantity() {
        return this.wheelsQuantity;
    }

    public double getWeight() {
        return this.Weight;
    }

    public int getTopSpeed() {
        return this.TopSpeed;
    }

    //setters
    public void setType(String Type) {
        this.Type = Type;
    }

    public void setWheelsquantity(int WheelsQuantity) {
        this.wheelsQuantity = WheelsQuantity;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

    public void TopSpeed(int TopSpeed) {
        this.TopSpeed = TopSpeed;
    }

    @Override
    public String toString() {
        return "class Vehicle--> BIKE--> KTM " +
                "[ Tipul : " + Type + " ,  Roti : " + wheelsQuantity +
                " , Greutate : " + Weight + " , Viteza : " + TopSpeed + "]";
    }

}

