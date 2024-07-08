package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "sbd_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String fname;
    private String lname;
    private String email;
    private String address;

    public User() {
    }

    public User(String fname, String lname, String email, String address) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.address = address;
    }

    public String toString() {
        return String.format("%s %s %s %s", fname, lname, email, address);
    }

    public String toCsv() {
        return String.format("%s,%s,%s,%s", fname, lname, email, address);
    }
}
