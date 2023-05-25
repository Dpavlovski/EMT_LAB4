package mk.ukim.finki.emt.labs.reservationmanagement.infra;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.labs.sharedkernel.domain.events.DomainEvent;
import mk.ukim.finki.emt.labs.sharedkernel.infra.DomainEventPublisher;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DomainEventPublisherImpl implements DomainEventPublisher {

    private final KafkaTemplate<String,String> kafkaTemplate;
    @Override
    public void publish(DomainEvent event) {
        this.kafkaTemplate.send(event.topic(),event.toJson());
    }
}
