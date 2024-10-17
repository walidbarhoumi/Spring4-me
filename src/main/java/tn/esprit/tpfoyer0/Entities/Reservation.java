package tn.esprit.tpfoyer0.Entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Reservation {
    @Id
    private String idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;

    @ManyToOne
    @JoinColumn(name = "idChambre")
    private Chambre chambre;

    @ManyToOne
    @JoinColumn(name = "idEtudiant")
    private Etudiant etudiant;

    // Getters, Setters, Constructors
}

