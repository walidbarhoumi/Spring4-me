package tn.esprit.tpfoyer0.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.tpfoyer0.Entities.Chambre;
import tn.esprit.tpfoyer0.Repositories.ChambreRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ChambreServiceIMP implements ChambreService {

    @Autowired
    private ChambreRepository chambreRepository;

    @Override
    public Chambre createChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Optional<Chambre> getChambreById(Long id) {
        return chambreRepository.findById(id);
    }

    @Override
    public Chambre updateChambre(Long id, Chambre chambreDetails) {
        Optional<Chambre> chambreOptional = chambreRepository.findById(id);

        if (chambreOptional.isPresent()) {
            Chambre chambre = chambreOptional.get();
            chambre.setNumeroChambre(chambreDetails.getNumeroChambre());
            chambre.setTypeC(chambreDetails.getTypeC());
            return chambreRepository.save(chambre);
        } else {
            throw new RuntimeException("Chambre non trouvée avec ID : " + id);
        }
    }

    @Override
    public void deleteChambre(Long id) {
        chambreRepository.deleteById(id);
    }

    @Override
    public List<Chambre> addAllChambres(List<Chambre> c) {
        return chambreRepository.saveAll(c);
    }
}
