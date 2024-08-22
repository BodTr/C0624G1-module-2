package com.practice.practice_17_8_2024;

public class HandsPhone extends Phone {
    private String nation;
    private String status;
    public HandsPhone(String nation, String status, String id, String name, double price, int count, String manufacturer) {
        super(id, name, price, count, manufacturer);
        this.nation = nation;
        this.status = status;
    }
    public String getNation() {
        return nation;
    }
    public void setNation(String nation) {
        this.nation = nation;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
