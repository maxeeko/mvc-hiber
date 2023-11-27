package com.maxeeko.mvchiber.models;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user_table", schema = "public")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @NotEmpty(message = "Empty name!")
    @Size(min = 2, max = 30, message = "Name incorrect!")
    @Column(name = "name")
    private String name;

    @NotEmpty(message = "Empty surname!")
    @Size(min = 2, max = 30, message = "Surname incorrect!")
    @Column(name = "surname")
    private String surname;

    @NotEmpty(message = "Empty Email!")
    @Email(message = "Email incorrect!")
    @Column(name = "email")
    private String email;

    @NotEmpty(message = "Empty phone number!")
    @Column(name = "phone_number")
    private String phoneNumber;

    public User() {
    }

    public User(String name, String surname, String email, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
