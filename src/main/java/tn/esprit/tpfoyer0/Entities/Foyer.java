package tn.esprit.tpfoyer0.Entities;

import jakarta.persistence.*;

@Entity
public class Foyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer;
    private String nomFoyer;
    private Long capaciteFoyer;

    @ManyToOne
    @JoinColumn(name = "idUniversite")
    private Universite universite;

    // Getters, Setters, Constructors
}

