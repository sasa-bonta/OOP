package com.company;

public class Main {

    public static void main(String[] args) {

        Car Mercedes=new Car("Albastra", 21.5);

        Bike KTM=new Bike(11.7, 59, 21, 29);

        System.out.print("\n\n");
        System.out.println(Mercedes.toString());
        System.out.print("\n\n");
        System.out.println(KTM.toString());

        Auto BMW=new Auto(1257.3, 5, 99, "Benzin");

        System.out.print("\n\n");
        System.out.println(BMW.toString());

        System.out.print("privet");
    }
}