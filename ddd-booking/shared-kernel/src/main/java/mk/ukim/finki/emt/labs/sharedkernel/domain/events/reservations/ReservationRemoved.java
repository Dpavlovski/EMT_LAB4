package mk.ukim.finki.emt.labs.sharedkernel.domain.events.reservations;

import lombok.Getter;
import mk.ukim.finki.emt.labs.sharedkernel.domain.config.TopicHolder;
import mk.ukim.finki.emt.labs.sharedkernel.domain.events.DomainEvent;

@Getter
public class ReservationRemoved extends DomainEvent {
    private final String destinationId;

    public ReservationRemoved(String destinationId) {
        super(TopicHolder.TOPIC_reservation_removed);
        this.destinationId = destinationId;
    }

}
