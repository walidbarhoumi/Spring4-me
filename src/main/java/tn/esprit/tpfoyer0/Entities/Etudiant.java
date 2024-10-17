package tn.esprit.tpfoyer0.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    private Date dateNaissance;

    // Getters, Setters, Constructors
}

