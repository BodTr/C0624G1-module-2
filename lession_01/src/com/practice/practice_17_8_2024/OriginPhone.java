package com.practice.practice_17_8_2024;
import java.util.Objects;
import java.util.Scanner;

public class OriginPhone  extends Phone {
    private String warrantyPeriod;
    private String warrantyScope;
    public OriginPhone(String warrantyPeriod, String warrantyScope, String id, String name, double price, int count, String manufacturer) {
        super(id, name, price, count, manufacturer);
        this.warrantyPeriod = warrantyPeriod;
        this.warrantyScope = warrantyScope;
    }
    public String getWarrantyPeriod() {
        return warrantyPeriod;
    }
    public void setWarrantyPeriod(String warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }
    public String getWarrantyScope() {
        return warrantyScope;
    }
    public void setWarrantyScope(String warrantyScope) {
        this.warrantyScope = warrantyScope;
    }

}
