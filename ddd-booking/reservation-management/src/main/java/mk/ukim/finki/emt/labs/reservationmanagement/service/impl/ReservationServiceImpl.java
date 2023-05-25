package mk.ukim.finki.emt.labs.reservationmanagement.service.impl;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.labs.reservationmanagement.domain.models.Reservation;
import mk.ukim.finki.emt.labs.reservationmanagement.domain.models.ReservationId;
import mk.ukim.finki.emt.labs.reservationmanagement.repository.ReservationRepository;
import mk.ukim.finki.emt.labs.reservationmanagement.service.ReservationService;
import mk.ukim.finki.emt.labs.reservationmanagement.service.forms.ReservationForm;
import org.springframework.stereotype.Service;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;
import java.time.Instant;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class ReservationServiceImpl implements ReservationService {
    private final ReservationRepository reservationRepository;
    private final Validator validator;
    @Override
    public ReservationId placeHolder(ReservationForm reservationForm) {
        Objects.requireNonNull(reservationForm,"reservation must not be null");
        var constraintViolations= validator.validate(reservationForm);
        if(constraintViolations.size()>0) throw new ConstraintViolationException("The order for is not valid",constraintViolations);
        var newOrder=reservationRepository.saveAndFlush(toDomainObject(reservationForm));
        return newOrder.getId();
    }

    @Override
    public List<Reservation> findAll() {
        return reservationRepository.findAll();
    }

    @Override
    public Optional<Reservation> findById(ReservationId id) {
        return reservationRepository.findById(id);
    }


    private Reservation toDomainObject(ReservationForm reservationForm){
        return new Reservation(Instant.now(),reservationForm.getCurrency());
    }
}
