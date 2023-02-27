package com.inheritance.entity;

import javax.persistence.Entity;

@Entity
public class Brand extends Vehicle{

    public Brand() {
    }

    public Brand(long vehicleId, String manufacturer, String name, String seatingCapacity) {
        super(vehicleId, manufacturer);
        this.name = name;
        this.seatingCapacity = seatingCapacity;
    }

    private String name;
    private String seatingCapacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(String seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }


}
