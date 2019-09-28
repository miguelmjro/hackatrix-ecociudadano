package com.co.latin.ecociudadano.model;

import javax.persistence.*;

@Entity
@Table(name = "container")
public class Container {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "latitude")
    private Double latitude;

    @Column(name = "longitude")
    private Double longitude;
}
