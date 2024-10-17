package tn.esprit.tpfoyer0.Entities;

import jakarta.persistence.*;

@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;

    // Getters, Setters, Constructors
}

