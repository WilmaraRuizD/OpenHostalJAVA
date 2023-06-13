package com.example.openHostal.Entity;

import jakarta.persistence.*;

@Entity
@Table
public class Users {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id ;
    private String name;
    private String lastName;
    private String email ;
    private String password;
    private String phone ;
    private String documentType ;

    private int documentNumber ;
    private String nationality ;
    private Long id_rol ;
   private Long id_hostal ;


   public Users(){

   }
   public Users(Long id , String name, String lastName, String email, String password,
                String phone, String documentType , int documentNumber, String nationality , Long id_rol , Long id_hostal ){

      this.id=id;
      this.name=name;
      this.lastName=lastName;
      this.email=email;
      this.password=password;
      this.phone=phone;
      this.documentType=documentType;
      this.documentNumber=documentNumber;
      this.nationality=nationality;
      this.id_rol=id_rol;
      this.id_hostal=id_hostal;
   }

    public Users(String name, String lastName, String email, String password,
                 String phone, String documentType , int documentNumber, String nationality , Long id_rol , Long id_hostal ){
        this.name=name;
        this.lastName=lastName;
        this.email=email;
        this.password=password;
        this.phone=phone;
        this.documentType=documentType;
        this.documentNumber=documentNumber;
        this.nationality=nationality;
        this.id_rol=id_rol;
        this.id_hostal=id_hostal;

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    public Long getId_hostal() {
        return id_hostal;
    }

    public void setId_hostal(Long id_hostal) {
        this.id_hostal = id_hostal;
    }
}