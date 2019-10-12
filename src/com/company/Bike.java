package com.company;
//Exemplu Mostenire
public class Bike extends Vehicle {
    private double FrameSize;
    private double WheelsSize;


//Constructor
Bike(double Weight, int TopSpeed, double FrameSize, double WheelsSize){
    super (Weight, TopSpeed );
    this.FrameSize=FrameSize;
    this.WheelsSize=WheelsSize;
    //**Nu sa primit sa fac ca sa nu introduc la fiecare BIKE nou: Type="Bicycle si WheelsQuantity=2"
    //this.Type="Bicycle";
    //this.WheelsQuantity=2;
}

//getters
    public double getFrameSize(){ return this.FrameSize; }
    public double getWheelsSize(){ return this.WheelsSize; }

//setters
    public void setFrameSize( double FrameSize){
        this.FrameSize=FrameSize;
    }

    public void setWheelsSize( double WheelsSize ){
        this.WheelsSize=WheelsSize;
    }

}