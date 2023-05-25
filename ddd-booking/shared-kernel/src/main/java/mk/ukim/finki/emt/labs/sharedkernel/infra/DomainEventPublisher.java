package mk.ukim.finki.emt.labs.sharedkernel.infra;

import mk.ukim.finki.emt.labs.sharedkernel.domain.events.DomainEvent;

public interface DomainEventPublisher {
    void publish(DomainEvent event);
}
