package org.example.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name="Passagers")

public class PassengerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num_pas;
    @Column(nullable = false, length = 100)
    private String nom;
    @Column(nullable = false, length = 100)
    private String prenom;

    @OneToMany(mappedBy = "passagerID")
    private Collection<VolPassagerEntity> vools;

}
