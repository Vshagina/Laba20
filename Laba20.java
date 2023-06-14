package com.company;

public class Laba20 {
    public static void main(String[] args) {

        createAndTransport(new Truck_Factory());
        createAndTransport(new Ship_Factory());
        createAndTransport(new Plane_Factory());
    }

    public static void createAndTransport(Transport_Factory factory) {
        Transport transport = factory.create();
        transport.transport();
    }
}

