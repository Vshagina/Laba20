package com.company;

public class Plane_Factory implements Transport_Factory {
    public Transport create() {
        return new Plane();
    }
}
