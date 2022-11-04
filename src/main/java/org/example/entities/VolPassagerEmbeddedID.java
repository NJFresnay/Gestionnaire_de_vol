package org.example.entities;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class VolPassagerEmbeddedID implements Serializable {
    private static final Long serialVersionUID = 1L;

    private Long volId;
    private Long passagerId;
}
