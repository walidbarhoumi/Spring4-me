package tn.esprit.tpfoyer0.Services;

import tn.esprit.tpfoyer0.Entities.Chambre;

import java.util.List;
import java.util.Optional;

public interface ChambreService {
    Chambre createChambre(Chambre chambre); // Créer une chambre

    List<Chambre> getAllChambres();         // Récupérer toutes les chambres

    Optional<Chambre> getChambreById(Long id); // Récupérer une chambre par ID

    Chambre updateChambre(Long id, Chambre chambre); // Mettre à jour une chambre

    void deleteChambre(Long id);            // Supprimer une chambre

    List<Chambre> addAllChambres(List<Chambre> c);         // Récupérer toutes les chambres);
}