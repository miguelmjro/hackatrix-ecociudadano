package com.co.latin.ecociudadano.model;

import javax.persistence.*;

@Entity
@Table(name = "Clients")
public class Client {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_firstname")
    private String nameFirstname;

    @Column(name = "lasstname")
    private String lastname;

    @Column(name = "email")
    private String email;


    @Column(name = "contact_phone")
    private String contactPhone;


    @Column(name = "dni")
    private String dni;

    @Column(name = "dni_city")
    private String dni_city;

    @ManyToOne
    @JoinColumn(name = "User_id")
    private User userId;

    @Column(name = "dni_type")
    private String dnitype;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

