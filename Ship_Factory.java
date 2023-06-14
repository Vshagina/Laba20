package com.company;

public class Ship_Factory implements Transport_Factory {
    public Transport create() {
        return new Ship();
    }
}
