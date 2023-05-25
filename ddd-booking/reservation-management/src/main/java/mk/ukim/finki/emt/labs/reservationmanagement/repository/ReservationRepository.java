package mk.ukim.finki.emt.labs.reservationmanagement.repository;

import mk.ukim.finki.emt.labs.reservationmanagement.domain.models.Reservation;
import mk.ukim.finki.emt.labs.reservationmanagement.domain.models.ReservationId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation,ReservationId> {
}
