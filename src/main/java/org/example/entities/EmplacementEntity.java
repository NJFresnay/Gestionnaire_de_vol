package org.example.entities;

import jakarta.persistence.*;

import java.text.DateFormat;
import java.util.Collection;


@Entity
@Table(name="emplacement")

public class EmplacementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num_horaire;
    @Column(nullable = false, length = 190)
    private String ville_depart;
    @Column(nullable = false, length = 190)
    private String ville_arrivee;
    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private DateFormat heure_arrivee;
    @Column(nullable = false)
    @Temporal(TemporalType.TIME)
    private DateFormat heure_depart;

    @OneToMany(mappedBy = "place")
    private Collection<VolEntity> vols;

}
