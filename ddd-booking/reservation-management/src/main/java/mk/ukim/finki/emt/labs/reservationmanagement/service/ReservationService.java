package mk.ukim.finki.emt.labs.reservationmanagement.service;

import mk.ukim.finki.emt.labs.reservationmanagement.domain.models.Reservation;
import mk.ukim.finki.emt.labs.reservationmanagement.domain.models.ReservationId;
import mk.ukim.finki.emt.labs.reservationmanagement.service.forms.ReservationForm;
import java.util.List;
import java.util.Optional;

public interface ReservationService {
    ReservationId placeHolder(ReservationForm reservationForm);
    List<Reservation> findAll();
    Optional<Reservation> findById(ReservationId id);

}
