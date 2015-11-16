package dk.skat.regelapp.service;

import dk.skat.regelapp.domain.Konto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Rune Molin, rmo@nine.dk
 */
@Repository
public interface KontoRepository extends CrudRepository<Konto, Integer> {
}
