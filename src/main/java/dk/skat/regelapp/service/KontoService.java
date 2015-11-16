package dk.skat.regelapp.service;

import dk.skat.regelapp.domain.Konto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Rune Molin, rmo@nine.dk
 */
@Service
@Transactional
public class KontoService {
    private final KontoRepository kontoRepository;

    @Autowired
    public KontoService(KontoRepository kontoRepository) {
        this.kontoRepository = kontoRepository;
    }

    public Iterable<Konto> alleKonti() {
        return kontoRepository.findAll();
    }

    public void slet(Konto konto) {
        kontoRepository.delete(konto);
    }
}
