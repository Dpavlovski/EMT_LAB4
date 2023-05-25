package mk.ukim.finki.emt.labs.sharedkernel.domain.events.reservations;

import lombok.Getter;
import mk.ukim.finki.emt.labs.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.emt.labs.sharedkernel.domain.events.DomainEvent;

@Getter
public class ReservationAdded extends DomainEvent {
    private final String destinationId;

    public ReservationAdded(String destinationId) {
        super(TopicHolder.TOPIC_reservation_added);
        this.destinationId =destinationId;
    }
}

