package com.company;

public class Truck_Factory implements Transport_Factory {
    public Transport create() {
        return new Truck();
    }
}
