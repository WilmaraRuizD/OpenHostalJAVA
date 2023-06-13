package com.example.openHostal.Entity;

import jakarta.persistence.*;

@Entity
@Table

public class Hostal {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;
    private String city;
    private String campus;
    private String description;
    private String address ;
    private String photo;
    private float geometry1;
    private float geometry2;

    public Hostal() {
    }

    public Hostal(Long id, String name, String city, String campus, String description, String address, String photo, float geometry1, float geometry2) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.campus= campus;
        this.description = description;
        this.address = address;
        this.photo = photo;
        this.geometry1 = geometry1;
        this.geometry2 = geometry2;
    }

    public Hostal(String name, String city, String campus, String description, String address, String photo, float geometry1, float geometry2) {
        this.name = name;
        this.city = city;
        this.campus = campus;
        this.description = description;
        this.address = address;
        this.photo = photo;
        this.geometry1 = geometry1;
        this.geometry2 = geometry2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public float getGeometry1() {
        return geometry1;
    }

    public void setGeometry1(float geometry1) {
        this.geometry1 = geometry1;
    }

    public float getGeometry2() {
        return geometry2;
    }

    public void setGeometry2(float geometry2) {
        this.geometry2 = geometry2;
    }
}
