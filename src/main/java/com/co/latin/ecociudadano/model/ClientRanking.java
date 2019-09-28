package com.co.latin.ecociudadano.model;

import javax.persistence.*;

public class ClientRanking {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client clientId;

    @ManyToOne
    @JoinColumn(name = "ranking_id")
    private Ranking rankingId;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "score")
    private Double score;
}
