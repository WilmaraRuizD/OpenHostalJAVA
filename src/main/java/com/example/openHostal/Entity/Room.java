package com.example.openHostal.Entity;

import jakarta.persistence.*;

//@Entity
//@Table
public class Room {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

     private String type ;

     private String description ;

     private String photo;

     private int state ;

     private Integer ability;

     private String services ;

     private float price;

     private  String image;

     private Long id_hostal;

     public Room (Long id, String type,String description, String photo, int state,Integer ability,String services ,
                  float price, String image, Long id_hostal){

         this.id=id;
         this.type=type;
         this.description=description;
         this.photo=photo;
         this.state=state;
         this.ability=ability;
         this.services=services;
         this.price=price;
         this.image=image;
         this.id_hostal=id_hostal;

     }

    public Room (String type,String description, String photo, int state,Integer ability,String services ,
                 float price, String image, Long id_hostal){

        this.type=type;
        this.description=description;
        this.photo=photo;
        this.state=state;
        this.ability=ability;
        this.services=services;
        this.price=price;
        this.image=image;
        this.id_hostal=id_hostal;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Integer getAbility() {
        return ability;
    }

    public void setAbility(Integer ability) {
        this.ability = ability;
    }

    public String getServices() {
        return services;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getId_hostal() {
        return id_hostal;
    }

    public void setId_hostal(Long id_hostal) {
        this.id_hostal = id_hostal;
    }
}
