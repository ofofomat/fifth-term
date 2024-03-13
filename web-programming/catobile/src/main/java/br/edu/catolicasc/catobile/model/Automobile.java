package br.edu.catolicasc.catobile.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Automobile {
    @Id
    @GeneratedValue
    private Long id;
    private String licensePlate;
    private String brand;




    public Long getId() {
        return id;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public String getLicensePlate() {
        return licensePlate;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getBrand() {
        return brand;
    }
}
