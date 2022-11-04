package org.example.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;

@Entity
@Table(name="vol_passager")

public class VolPassagerEntity {
    @EmbeddedId
    private  VolPassagerEmbeddedID id;

    @ManyToOne
    @MapsId("volId")
    private VolEntity volID;

    @ManyToOne
    @MapsId("passagerId")
    private PassengerEntity passagerID;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Calendar date_reservation;

}
