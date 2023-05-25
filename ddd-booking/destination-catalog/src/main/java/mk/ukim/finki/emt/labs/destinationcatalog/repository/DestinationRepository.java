package mk.ukim.finki.emt.labs.destinationcatalog.repository;

import mk.ukim.finki.emt.labs.destinationcatalog.domain.models.Destination;
import mk.ukim.finki.emt.labs.destinationcatalog.domain.models.DestinationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinationRepository extends JpaRepository<Destination, DestinationId> {
}
