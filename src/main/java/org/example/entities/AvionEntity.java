package org.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Avions")

public class AvionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long num_avion;
    @Column(nullable = false, length = 100)
    private String compagnie;
    @Column(length = 100)
    private String constructeur;

    private String modele;
    @Column(nullable = false)
    private Short capacite;

    @OneToMany(mappedBy = "avion")
    private Collection<VolEntity> vols;

}
