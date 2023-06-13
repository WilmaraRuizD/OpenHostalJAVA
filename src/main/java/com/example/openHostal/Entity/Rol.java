package com.example.openHostal.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class Rol {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(unique = true)
    private String nameRol;

    public Rol (){

    }
    public Rol ( Long id, String nameRol){
        this.id = id;
        this.nameRol=nameRol;

    }
    public Rol (  String nameRol){
        this.nameRol=nameRol;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameRol() {
        return nameRol;
    }

    public void setNameRol(String nameRol) {
        this.nameRol = nameRol;
    }
}

