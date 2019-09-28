package com.co.latin.ecociudadano.model;

import javax.persistence.*;

@Entity
@Table(name = "garbage_transaction")
public class GarbageTransaction {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client clientId;

    @ManyToOne
    @JoinColumn(name = "container_id")
    private Client containerId;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "point")
    private Double point;
}
