package org.example.entities;

import jakarta.persistence.*;

import java.util.Calendar;
import java.util.Collection;

@Entity
@Table(name="Vols")

public class VolEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num_vol;
    @Column(nullable = false)
    private Calendar jour_sem;
    @Column(nullable = false)
    private Calendar jour;
    @Column(nullable = false)
    private Short placeLibre;

    @ManyToOne
    private AvionEntity avion;

    @ManyToOne
    private EmplacementEntity place;

    @OneToMany(mappedBy = "volID")
    private Collection<VolPassagerEntity> passagers;

}
