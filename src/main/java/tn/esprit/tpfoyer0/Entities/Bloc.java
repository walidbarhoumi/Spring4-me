package tn.esprit.tpfoyer0.Entities;

import jakarta.persistence.*;

@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    private String nomBloc;
    private Long capaciteBloc;

    @ManyToOne
    @JoinColumn(name = "idFoyer")
    private Foyer foyer;

    // Getters, Setters, Constructors
}
