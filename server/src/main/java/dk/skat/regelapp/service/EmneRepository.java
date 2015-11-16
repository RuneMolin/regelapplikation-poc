package dk.skat.regelapp.service;

import dk.skat.regelapp.domain.Emne;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @author Rune Molin, rmo@nine.dk
 */
public interface EmneRepository extends Repository<Emne, Long> {
    List<Emne> findByNavn(String navn);
}
