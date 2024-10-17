package tn.esprit.tpfoyer0.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.tpfoyer0.Entities.Chambre;
import tn.esprit.tpfoyer0.Entities.TypeChambre;

import java.util.List;
import java.util.Optional;

@Repository
public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    // Lire une chambre par son numéro de chambre
    Optional<Chambre> findByNumeroChambre(Long numeroChambre);

    // Lire toutes les chambres d'un bloc spécifique
    List<Chambre> findByBlocIdBloc(Long idBloc);

    // Supprimer une chambre par son numéro de chambre
    void deleteByNumeroChambre(Long numeroChambre);

    // Compter le nombre de chambres par type de chambre
    long countByTypeC(TypeChambre typeC);
}
