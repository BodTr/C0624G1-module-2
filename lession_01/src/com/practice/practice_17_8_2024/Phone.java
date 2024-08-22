package com.practice.practice_17_8_2024;

public class Phone {
    private String id;
    private String name;
    private double price;
    private int count;
    private String manufacturer;
    public Phone(String id, String name, double price, int count, String manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
        this.manufacturer = manufacturer;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

}
